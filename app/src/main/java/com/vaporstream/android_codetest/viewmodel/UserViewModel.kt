package com.vaporstream.android_codetest.viewmodel

import android.app.Application
import android.util.Log
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.model.User
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application), Observable {

    @Bindable
    private val _user = MutableLiveData<User>()

    val user: LiveData<User>
        get() = _user

    @Bindable
    val firstName = MutableLiveData<String>()

    @Bindable
    val lastName = MutableLiveData<String>()

    @Bindable
    val phoneNumber = MutableLiveData<String>()

    @Bindable
    val addressOne = MutableLiveData<String>()

    @Bindable
    val addressTwo = MutableLiveData<String>()

    @Bindable
    val city = MutableLiveData<String>()

    @Bindable
    val state = MutableLiveData<Int>()

    @Bindable
    val zipCode = MutableLiveData<String>()

    val statesArray = ObservableArrayList<String>()


    init {
        viewModelScope.launch {
            lastName.value = ""
            firstName.value = ""
            phoneNumber.value = ""
            addressOne.value = ""
            addressTwo.value = ""
            city.value = ""
            state.value = 0
            zipCode.value = ""

            statesArray.addAll(application.resources.getStringArray(R.array.states_array))
        }

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

    fun submit() {

        //Validate
        val validFirstName: Boolean = !firstName.value.isNullOrBlank()
        val validLastName: Boolean = !firstName.value.isNullOrBlank()
        val validAddressOne: Boolean = !addressOne.value.isNullOrBlank()
        val validCity: Boolean = !city.value.isNullOrBlank()

        val validPhoneNumber: Boolean = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$".toRegex().matches("${phoneNumber.value}")
        val validZipCode: Boolean = "^\\d{5}(?:[-\\s]\\d{4})?\$".toRegex().matches("${zipCode.value}")

        Log.d("SUBMIT", "submit: \n" +
                "firstName: ${firstName.value} ($validFirstName)\n" +
                "lastName: ${lastName.value} ($validLastName) \n" +
                "phoneNumber: ${phoneNumber.value} ($validPhoneNumber) \n" +
                "addressOne: ${addressOne.value} ($validAddressOne) \n" +
                "addressTwo: ${addressTwo.value} \n" +
                "city: ${city.value} ($validCity) \n" +
                "state: ${state.value}\n" +
                "zipCode: ${zipCode.value} ($validZipCode) \n"
        )
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}


