package com.vaporstream.android_codetest.services

import androidx.lifecycle.MutableLiveData
import com.vaporstream.android_codetest.model.User

object RoomUserService {

    suspend fun getUser(): User {
        //Todo: Use Room to save the user input to an android_code_test database on submission, and retrieve the data back to display
        TODO("Unimplemented")
    }

    suspend fun setUser(
            firstName: String,
            lastName: String,
            phoneNumber: String,
            addressOne: String,
            addressTwo: String,
            city: String,
            state: Int,
            zipCode: String
    ): Boolean {




        //Todo: Use Room to save the user input to an android_code_test database on submission, and retrieve the data back to display
        TODO("Unimplemented")

    }
}