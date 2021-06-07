package com.vaporstream.android_codetest

import android.app.Application
import com.vaporstream.android_codetest.di.ApplicationComponent
import com.vaporstream.android_codetest.di.ApplicationModule
import com.vaporstream.android_codetest.di.DaggerApplicationComponent

class MyApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        component = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    companion object {
        private var INSTANCE: MyApplication? = null

        @JvmStatic
        fun get(): MyApplication = INSTANCE!!
    }
}