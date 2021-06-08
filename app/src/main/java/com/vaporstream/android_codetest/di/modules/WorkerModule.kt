package com.vaporstream.android_codetest.di.modules

import androidx.work.WorkManager
import com.vaporstream.android_codetest.MyApplication
import com.vaporstream.android_codetest.utilities.Constants
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class WorkerModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun provideWorkManager(): WorkManager {
        return WorkManager.getInstance(application.applicationContext)
    }

    @Singleton
    @Provides
    fun provideStates(uuid: UUID): List<String>? {
        return WorkManager.getInstance(application.applicationContext)
            .getWorkInfoByIdLiveData(uuid)?.value?.outputData?.getStringArray(
            Constants.STATE
        )?.toList()
    }

}