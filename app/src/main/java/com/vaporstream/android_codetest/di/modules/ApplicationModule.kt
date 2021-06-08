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
class ApplicationModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun providesApplication(): MyApplication = application
}