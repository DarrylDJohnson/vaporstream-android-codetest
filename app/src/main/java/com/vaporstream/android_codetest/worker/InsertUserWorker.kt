package com.vaporstream.android_codetest.worker

import android.app.Application
import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.model.User
import com.vaporstream.android_codetest.utilities.Constants

class InsertUserWorker(context: Context, params: WorkerParameters) :
    Worker(context, params) {

    override fun doWork(): Result {
        val firstName = inputData.getString(Constants.FIRST_NAME)
        val lastName = inputData.getString(Constants.LAST_NAME)
        val phoneNumber = inputData.getString(Constants.PHONE_NUMBER)
        val addressOne = inputData.getString(Constants.ADDRESS_ONE)
        val addressTwo = inputData.getString(Constants.ADDRESS_TWO)
        val city = inputData.getString(Constants.CITY)
        val state = inputData.getString(Constants.STATE)
        val zipCode = inputData.getString(Constants.ZIP_CODE)

        if (firstName.isNullOrBlank() ||
            lastName.isNullOrBlank() ||
            phoneNumber.isNullOrBlank() ||
            addressOne.isNullOrBlank() ||
            city.isNullOrBlank() ||
            state.isNullOrBlank() ||
            zipCode.isNullOrBlank()
        ) {
            return Result.failure()
        }

        val user =
            User(firstName, lastName, phoneNumber, addressOne, addressTwo, city, state, zipCode)
        val dao = UserDatabase.getInstance(applicationContext).userDatabaseDao
        val uid = dao.insert(user)
        val output = workDataOf(Constants.UID to uid)

        return Result.success(output)
    }
}
