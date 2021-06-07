package com.vaporstream.android_codetest.viewmodel.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserViewModelFactory(private val uid: Long)
    : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(uid) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}