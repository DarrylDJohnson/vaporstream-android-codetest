package com.vaporstream.android_codetest.repository

import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepositoryImpl : UserRepository {

    @Inject
    lateinit var userDao: UserDatabaseDao

    init {
        Injector.get().inject(this)
    }

    override suspend fun getUser(uid: Long): User? {
        return withContext(Dispatchers.IO) {
            return@withContext userDao.get(uid)
        }
    }

    override suspend fun insertUser(user: User): Long {
        return withContext(Dispatchers.IO) {
            return@withContext userDao.insert(user)
        }
    }
}