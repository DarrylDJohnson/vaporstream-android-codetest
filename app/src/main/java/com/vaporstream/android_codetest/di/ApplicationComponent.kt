package com.vaporstream.android_codetest.di

import com.vaporstream.android_codetest.di.modules.*
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.view.main.MainActivity
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel
import com.vaporstream.android_codetest.viewmodel.user.UserViewModel
import com.vaporstream.android_codetest.worker.GetStatesWorker
import com.vaporstream.android_codetest.worker.InsertUserWorker
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitModule::class, WorkerModule::class, StatesModule::class, UserModule::class])
interface ApplicationComponent {
    fun inject(userViewModel: UserViewModel)
    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(userRepository: UserRepositoryImpl)
    fun inject(getStatesWorker: GetStatesWorker)
    fun inject(mainActivity: MainActivity)
}