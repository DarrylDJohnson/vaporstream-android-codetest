package com.vaporstream.android_codetest.viewmodel.user

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.repository.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel(uid: Long) : ViewModel(), Observable {

    @Inject
    lateinit var userRepository: UserRepository

    private val _user = MutableLiveData<User>()

    val user: LiveData<User>
        get() = _user

    init {
        Injector.getComponent().inject(this)

        viewModelScope.launch {
            _user.postValue(userRepository.getUser(uid))
        }
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}