package com.vaporstream.android_codetest

import android.app.Application
import com.vaporstream.android_codetest.di.ApplicationComponent
import com.vaporstream.android_codetest.di.DaggerApplicationComponent
import com.vaporstream.android_codetest.di.modules.*

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        applicationComponent = DaggerApplicationComponent
            .builder()
            .retrofitModule(RetrofitModule())
            .statesModule(StatesModule(this))
            .workerModule(WorkerModule(this))
            .userModule(UserModule(this))
            .build()
    }

    companion object {
        private var INSTANCE: MyApplication? = null

        @JvmStatic
        fun get(): MyApplication = INSTANCE!!
    }
}