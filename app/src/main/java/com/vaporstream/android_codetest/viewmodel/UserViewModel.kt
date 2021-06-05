package com.vaporstream.android_codetest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.services.RoomUserService
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user


    init{
        viewModelScope.launch{
            _user.value = RoomUserService.getUser();
        }
    }
}