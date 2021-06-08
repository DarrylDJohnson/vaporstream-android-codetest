package com.vaporstream.android_codetest

import android.app.Application
import com.vaporstream.android_codetest.di.ApplicationComponent
import com.vaporstream.android_codetest.di.DaggerApplicationComponent
import com.vaporstream.android_codetest.di.modules.DatabaseModule
import com.vaporstream.android_codetest.di.modules.NetworkModule

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        applicationComponent = DaggerApplicationComponent
            .builder()
            .databaseModule(DatabaseModule(this))
            .networkModule(NetworkModule())
            .build()
    }

    companion object {
        private var INSTANCE: MyApplication? = null

        @JvmStatic
        fun get(): MyApplication = INSTANCE!!
    }
}