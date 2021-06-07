package com.vaporstream.android_codetest.repository

import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepositoryImpl(private val userDao: UserDatabaseDao) : UserRepository {
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