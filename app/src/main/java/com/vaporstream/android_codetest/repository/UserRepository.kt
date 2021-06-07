package com.vaporstream.android_codetest.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.model.User
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class UserRepository(application: Application, var uid: Long?) {

    private val dao: UserDatabaseDao = UserDatabase.getInstance(application).userDatabaseDao

    private val _user = MutableLiveData<User>()

    val user: LiveData<User>
        get() = _user

    init {
        uid?.let { getUser(it) }
    }

    fun getUser(uid: Long) = runBlocking {
        launch { _user.value = dao.get(uid) }
    }

    fun insert(
            user: User,
            onComplete: (Long?) -> Unit,
    ) = runBlocking {
        launch {
            onComplete.invoke(dao.insert(user))
        }
    }
}