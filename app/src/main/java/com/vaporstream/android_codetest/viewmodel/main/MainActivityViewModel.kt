package com.vaporstream.android_codetest.viewmodel.main

import android.util.Log
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.work.*
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.utilities.*
import com.vaporstream.android_codetest.worker.InsertUserWorker
import java.util.*
import javax.inject.Inject

class MainActivityViewModel : ViewModel(), Observable {

    @Inject
    lateinit var requestIdLiveData: MutableLiveData<UUID>

    @Inject
    lateinit var workManager: WorkManager

    @Inject
    lateinit var states: LiveData<Array<String>>

    @Bindable
    val firstName = MutableLiveData("")

    @Bindable
    val lastName = MutableLiveData("")

    @Bindable
    val phoneNumber = MutableLiveData("")

    @Bindable
    val addressOne = MutableLiveData("")

    @Bindable
    val addressTwo = MutableLiveData("")

    @Bindable
    val city = MutableLiveData("")

    @Bindable
    val spinnerPosition = MutableLiveData(0)

    @Bindable
    val zipCode = MutableLiveData("")

    val state = MediatorLiveData<String>()

    @Bindable
    val submitEnabled = MediatorLiveData<Boolean>()

    init {
        Injector.getComponent().inject(this)

        state.addSource(spinnerPosition) {

            Log.d(TAG, "state.addSource: spinnerPosition: ${spinnerPosition.value}")

            if (!states.value.isNullOrEmpty())
                state.value = states.value!![it]

        }

        submitEnabled.addSources(
            firstName,
            lastName,
            phoneNumber,
            addressOne,
            city,
            state,
            zipCode
        ) {
            submitEnabled.value = validate(
                firstName.value,
                lastName.value,
                phoneNumber.value,
                addressOne.value,
                city.value,
                state.value,
                zipCode.value
            )
        }

        dummy()
    }


    private fun validate(
        firstName: String?,
        lastName: String?,
        phoneNumber: String?,
        addressOne: String?,
        city: String?,
        state: String?,
        zipCode: String?,
    ): Boolean {
        return firstName.isNotNullOrBlank() &&
                lastName.isNotNullOrBlank() &&
                phoneNumber!!.matchesPhoneNumber() &&
                addressOne.isNotNullOrBlank() &&
                city.isNotNullOrBlank() &&
                state.isNotNullOrBlank() &&
                state != Constants.SELECT_A_STATE &&
                zipCode!!.matchesZipCode()
    }

    fun clear() {
        firstName.value = ""
        lastName.value = ""
        phoneNumber.value = ""
        addressOne.value = ""
        addressTwo.value = ""
        city.value = ""
        spinnerPosition.value = 0
        zipCode.value = ""
    }

    fun submit() {
        val userData = workDataOf(
            Constants.FIRST_NAME to firstName.value,
            Constants.LAST_NAME to lastName.value,
            Constants.PHONE_NUMBER to phoneNumber.value,
            Constants.ADDRESS_ONE to addressOne.value,
            Constants.ADDRESS_TWO to addressTwo.value,
            Constants.CITY to city.value,
            Constants.STATE to state.value,
            Constants.ZIP_CODE to zipCode.value,
        )

        val constraints =
            Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()

        val workRequest =
            OneTimeWorkRequestBuilder<InsertUserWorker>().setConstraints(constraints)
                .setInputData(userData)
                .build()

        workManager.enqueue(workRequest)

        requestIdLiveData.postValue(workRequest.id)
    }

    fun dummy() {
        firstName.value = "First"
        lastName.value = "Last"
        phoneNumber.value = "1234567890"
        addressOne.value = "Some Address"
        addressTwo.value = ""
        city.value = "Some City"
        spinnerPosition.value = 5
        zipCode.value = "12345"
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    companion object {
        private const val TAG = "MainActivityViewModel"
    }
}