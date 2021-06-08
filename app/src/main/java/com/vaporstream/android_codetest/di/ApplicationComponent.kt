package com.vaporstream.android_codetest.di

import com.vaporstream.android_codetest.di.modules.ApplicationModule
import com.vaporstream.android_codetest.di.modules.DatabaseModule
import com.vaporstream.android_codetest.di.modules.NetworkModule
import com.vaporstream.android_codetest.di.modules.WorkerModule
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel
import com.vaporstream.android_codetest.viewmodel.user.UserViewModel
import com.vaporstream.android_codetest.worker.GetStatesWorker
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, DatabaseModule::class, NetworkModule::class, WorkerModule::class])
interface ApplicationComponent {
    fun inject(userViewModel: UserViewModel)
    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(userRepository: UserRepositoryImpl)
    fun inject(getStatesWorker: GetStatesWorker)
}