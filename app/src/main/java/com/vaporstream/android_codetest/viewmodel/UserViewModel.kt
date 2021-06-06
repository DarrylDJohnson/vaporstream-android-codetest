package com.vaporstream.android_codetest.viewmodel

import android.app.Application
import android.util.Log
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
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

    @Bindable
    val submitEnabled = MediatorLiveData<Boolean>()

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

            submitEnabled.addSources(firstName, lastName, phoneNumber, addressOne, city, state, zipCode) {
                submitEnabled.value = validate(firstName, lastName, phoneNumber, addressOne, city, state, zipCode)
            }

            statesArray.addAll(application.resources.getStringArray(R.array.states_array))
        }
    }

    private fun validate(
            firstName: MutableLiveData<String>,
            lastName: MutableLiveData<String>,
            phoneNumber: MutableLiveData<String>,
            addressOne: MutableLiveData<String>,
            city: MutableLiveData<String>,
            state: MutableLiveData<Int>,
            zipCode: MutableLiveData<String>
    ): Boolean {
        return !firstName.value.isNullOrBlank() &&
                !lastName.value.isNullOrBlank() &&
                PHONE_REGEX.toRegex().matches("${phoneNumber.value}") &&
                !addressOne.value.isNullOrBlank() &&
                !city.value.isNullOrBlank() &&
                state.value != 0 &&
                ZIP_CODE_REGEX.toRegex().matches("${zipCode.value}")
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
        Log.d(TAG, "submit: click")
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    companion object {
        private const val TAG = "UserViewModel"
        private const val PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$"
        private const val ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?\$"
    }
}

private fun <T> MediatorLiveData<T>.addSources(vararg sources: MutableLiveData<out Any>, onChanged: (Any) -> Unit) {
    sources.forEach { this.addSource(it, onChanged) }
}

