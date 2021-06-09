package com.vaporstream.android_codetest.di.modules

import androidx.work.WorkManager
import com.vaporstream.android_codetest.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WorkerModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun provideWorkManager(): WorkManager {
        return WorkManager.getInstance(application.applicationContext)
    }

}