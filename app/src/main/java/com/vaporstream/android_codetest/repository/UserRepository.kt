package com.vaporstream.android_codetest.repository

import com.vaporstream.android_codetest.model.User

interface UserRepository {
    suspend fun getUser(uid: Long): User?
    suspend fun insertUser(user: User): Long
}