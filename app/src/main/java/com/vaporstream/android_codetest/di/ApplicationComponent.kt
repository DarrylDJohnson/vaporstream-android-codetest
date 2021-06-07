package com.vaporstream.android_codetest.di

import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.view.main.MainActivity
import com.vaporstream.android_codetest.view.results.ResultsActivity
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel
import com.vaporstream.android_codetest.viewmodel.user.UserViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: ResultsActivity)
    fun inject(userViewModel: UserViewModel)
    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(userRepository: UserRepositoryImpl)
}