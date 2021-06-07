package com.vaporstream.android_codetest.viewmodel.main

import android.app.Application
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.utilities.PHONE_REGEX
import com.vaporstream.android_codetest.utilities.ZIP_CODE_REGEX
import com.vaporstream.android_codetest.utilities.addSources
import com.vaporstream.android_codetest.utilities.isNotNullOrBlank
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application) : AndroidViewModel(application), Observable {

    private val _repository = UserRepository(application, null)
    private val _statesArray = application.resources.getStringArray(R.array.states_array)

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

    val statesArray = ObservableArrayList<String>()

    @Bindable
    val submitEnabled = MediatorLiveData<Boolean>()

    init {
        /* Dummy Data */
        firstName.value = "First"
        lastName.value = "Last"
        phoneNumber.value = "1234567890"
        addressOne.value = "123 South Some Street"
        addressTwo.value = ""
        city.value = "Some City"
        state.value = 5
        zipCode.value = "12345"

        submitEnabled.addSources(firstName, lastName, phoneNumber, addressOne, city, state, zipCode) {
            validate(firstName.value, lastName.value, phoneNumber.value, addressOne.value, city.value, state.value, zipCode.value)
                    .also { submitEnabled.value = it }
        }
        statesArray.addAll(_statesArray)
    }

    private fun validate(
            firstName: String?,
            lastName: String?,
            phoneNumber: String?,
            addressOne: String?,
            city: String?,
            state: Int?,
            zipCode: String?,
    ): Boolean {
        return firstName.isNotNullOrBlank() &&
                lastName.isNotNullOrBlank() &&
                PHONE_REGEX.toRegex().matches("$phoneNumber") &&
                addressOne.isNotNullOrBlank() &&
                city.isNotNullOrBlank() &&
                state != 0 &&
                ZIP_CODE_REGEX.toRegex().matches("$zipCode")
    }

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

    fun submit(onComplete: (Long?) -> Unit) {
        viewModelScope.launch {
            val user = User(
                    firstName.value!!,
                    lastName.value!!,
                    phoneNumber.value!!,
                    addressOne.value!!,
                    addressTwo.value!!,
                    city.value!!,
                    this@MainActivityViewModel._statesArray[state.value!!],
                    zipCode.value!!,
            )

            _repository.insert(user, onComplete)
        }
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}