package com.vaporstream.android_codetest.viewmodel.main

import android.util.Log
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.services.JsonBinEndpoints
import com.vaporstream.android_codetest.services.StatesService
import com.vaporstream.android_codetest.utilities.*
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel(private val userRepository: UserRepository) : ViewModel(), Observable {


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
        //Retrieves data to populate States Array
        val request = StatesService.buildService(JsonBinEndpoints::class.java)
        val call = request.getStates()
        call.enqueue(object : Callback<List<String>> {
            override fun onResponse(call: Call<List<String>>?, response: Response<List<String>>) {
                states.add("Select a State")

                if (response.isSuccessful) {
                    states.addAll(response.body())
                }
            }

            override fun onFailure(call: Call<List<String>>?, t: Throwable?) {

                Log.d(TAG, "onResponse: $t")
            }
        })

        /* */
        submitEnabled.addSources(firstName, lastName, phoneNumber, addressOne, city, state, zipCode) {
            validate(firstName.value, lastName.value, phoneNumber.value, addressOne.value, city.value, state.value, zipCode.value)
                    .also { submitEnabled.value = it }
        }
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

    fun submit(onComplete: (Long?) -> Unit) = viewModelScope.launch {
        val user = User(
                firstName.value!!,
                lastName.value!!,
                phoneNumber.value!!,
                addressOne.value!!,
                addressTwo.value!!,
                city.value!!,
                this@MainActivityViewModel.states[state.value!!],
                zipCode.value!!,
        )

        onComplete(userRepository.insertUser(user))
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    companion object {
        private const val TAG = "MainActivityViewModel"
    }
}