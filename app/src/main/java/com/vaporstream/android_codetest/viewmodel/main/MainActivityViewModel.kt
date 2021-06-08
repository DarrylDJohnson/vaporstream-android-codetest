package com.vaporstream.android_codetest.viewmodel.main

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.vaporstream.android_codetest.MyApplication
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.utilities.*
import com.vaporstream.android_codetest.worker.InsertUserWorker
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import javax.inject.Inject

class MainActivityViewModel : ViewModel(), Observable {

    @Inject
    lateinit var application: MyApplication

    @Inject
    lateinit var statesInterface: StatesInterface

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
    val state = MutableLiveData(0)

    @Bindable
    val zipCode = MutableLiveData("")

    val states = ObservableArrayList<String>()

    @Bindable
    val submitEnabled = MediatorLiveData<Boolean>()

    init {
        Injector.getComponent().inject(this)

        initStates()

        initSubmitEnabled()
    }

    private fun initStates() = statesInterface.getStates().enqueue(
        object : Callback<List<String>> {
            override fun onResponse(
                call: Call<List<String>>?,
                response: Response<List<String>>
            ) {
                states.add(Constants.SELECT_A_STATE)

                if (response.isSuccessful)
                    states.addAll(response.body())
            }

            override fun onFailure(call: Call<List<String>>?, t: Throwable?) {}
        }
    )

    private fun initSubmitEnabled() = submitEnabled.addSources(
        firstName, lastName, phoneNumber, addressOne, city, state, zipCode
    ) {
        validate(
            firstName.value,
            lastName.value,
            phoneNumber.value,
            addressOne.value,
            city.value,
            state.value,
            zipCode.value
        )
            .also { submitEnabled.value = it }
    }

    private fun validate(
        firstName: String?,
        lastName: String?,
        phoneNumber: String?,
        addressOne: String?,
        city: String?,
        state: Int?,
        zipCode: String?,
    ): Boolean = firstName.isNotNullOrBlank() &&
            lastName.isNotNullOrBlank() &&
            phoneNumber.matchesPhoneNumber() &&
            addressOne.isNotNullOrBlank() &&
            city.isNotNullOrBlank() &&
            state != 0 &&
            zipCode.matchesZipCode()

    fun clear() {
        firstName.value = ""
        lastName.value = ""
        phoneNumber.value = ""
        addressOne.value = ""
        addressTwo.value = ""
        city.value = ""
        state.value = 0
        zipCode.value = ""
    }

    fun submit(): UUID {

        val userData = workDataOf(
            Constants.FIRST_NAME to firstName.value,
            Constants.LAST_NAME to lastName.value,
            Constants.PHONE_NUMBER to phoneNumber.value,
            Constants.ADDRESS_ONE to addressOne.value,
            Constants.ADDRESS_TWO to addressTwo.value,
            Constants.CITY to city.value,
            Constants.STATE to states[state.value!!],
            Constants.ZIP_CODE to zipCode.value,
        )

        val request = OneTimeWorkRequestBuilder<InsertUserWorker>()
            .setInputData(userData)
            .build()

        WorkManager.getInstance(application.applicationContext).enqueue(request)

        return request.id
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}