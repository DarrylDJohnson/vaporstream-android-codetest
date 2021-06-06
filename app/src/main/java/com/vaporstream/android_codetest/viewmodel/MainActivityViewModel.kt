package com.vaporstream.android_codetest.viewmodel

import android.app.Application
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.services.RoomUserService
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application) : AndroidViewModel(application), Observable {

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
        viewModelScope.launch {
            submitEnabled.addSources(firstName, lastName, phoneNumber, addressOne, city, state, zipCode) {
                submitEnabled.value = validate(firstName, lastName, phoneNumber, addressOne, city, state, zipCode)
            }

            statesArray.addAll(application.resources.getStringArray(R.array.states_array))
        }
    }

    private fun validate(
            firstName: LiveData<String>,
            lastName: LiveData<String>,
            phoneNumber: LiveData<String>,
            addressOne: LiveData<String>,
            city: LiveData<String>,
            state: LiveData<Int>,
            zipCode: LiveData<String>
    ): Boolean {
        return firstName.value.isNotNullOrBlank() &&
                lastName.value.isNotNullOrBlank() &&
                PHONE_REGEX.toRegex().matches("${phoneNumber.value}") &&
                addressOne.value.isNotNullOrBlank() &&
                city.value.isNotNullOrBlank() &&
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
        viewModelScope.launch {
            RoomUserService.setUser(
                    firstName.value!!,
                    lastName.value!!,
                    phoneNumber.value!!,
                    addressOne.value!!,
                    addressTwo.value!!,
                    city.value!!,
                    state.value!!,
                    zipCode.value!!,
            )
        }
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    companion object {
        private const val TAG = "UserViewModel"
        private const val PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$"
        private const val ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?\$"
    }
}

/**
 * Extension for MediatorLiveData to reduce redundant code
 */
private fun <T> MediatorLiveData<T>.addSources(vararg sources: LiveData<out Any>, onChanged: (Any) -> Unit) {
    sources.forEach { this.addSource(it, onChanged) }
}

/**
 * Extension for String to improve readability
 */
private fun String?.isNotNullOrBlank() = !this.isNullOrBlank()