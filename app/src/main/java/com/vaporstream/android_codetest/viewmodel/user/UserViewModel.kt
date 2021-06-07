package com.vaporstream.android_codetest.viewmodel.user

import android.app.Application
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.repository.UserRepository

class UserViewModel(application: Application, uid: Long) : AndroidViewModel(application), Observable {

    private val repository = UserRepository(application, uid)

    val user: LiveData<User>
        get() = repository.user

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}
}