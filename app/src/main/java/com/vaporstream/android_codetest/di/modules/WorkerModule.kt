package com.vaporstream.android_codetest.di.modules

import androidx.work.ListenableWorker
import androidx.work.WorkManager
import com.vaporstream.android_codetest.MyApplication
import com.vaporstream.android_codetest.di.DaggerWorkerFactory
import com.vaporstream.android_codetest.worker.GetStatesWorker
import com.vaporstream.android_codetest.worker.InsertUserWorker
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkerKey(val value: KClass<out ListenableWorker>)


@Module
class WorkerModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun provideWorkManager(): WorkManager {
        return WorkManager.getInstance(application.applicationContext)
    }

}