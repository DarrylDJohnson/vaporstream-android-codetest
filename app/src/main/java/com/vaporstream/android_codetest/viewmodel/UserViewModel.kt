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
        Log.d("SUBMIT", "submit: ${firstName.value}, ${lastName.value}, ${state.value}")
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}