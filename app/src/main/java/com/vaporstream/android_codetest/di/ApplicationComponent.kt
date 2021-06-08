package com.vaporstream.android_codetest.di

import com.vaporstream.android_codetest.di.modules.DatabaseModule
import com.vaporstream.android_codetest.di.modules.NetworkModule
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel
import com.vaporstream.android_codetest.viewmodel.user.UserViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class, NetworkModule::class])
interface ApplicationComponent {
    fun inject(userViewModel: UserViewModel)
    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(userRepository: UserRepositoryImpl)
}