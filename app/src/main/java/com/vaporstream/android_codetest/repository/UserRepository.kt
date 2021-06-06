package com.vaporstream.android_codetest.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vaporstream.android_codetest.model.User

object UserRepository {
    private val _user = MutableLiveData<User>()

    val user: LiveData<User>
        get() = _user

    init {
    }

    fun submit(){
        throw NotImplementedError()
    }

    fun clear(){
        throw NotImplementedError()
    }





}