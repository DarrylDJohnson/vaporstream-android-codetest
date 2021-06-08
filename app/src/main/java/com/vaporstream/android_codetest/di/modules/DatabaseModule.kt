package com.vaporstream.android_codetest.di.modules

import com.vaporstream.android_codetest.MyApplication
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(private val application: MyApplication) {

    @Provides
    fun provideUserDatabaseDao(): UserDatabaseDao {
        return UserDatabase.getInstance(application).userDatabaseDao
    }

    @Singleton
    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl()
    }
}