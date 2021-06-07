package com.vaporstream.android_codetest.viewmodel.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vaporstream.android_codetest.repository.UserRepository

class MainActivityViewModelFactory(private val userRepository: UserRepository)
    : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(userRepository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}