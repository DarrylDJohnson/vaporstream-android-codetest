package com.vaporstream.android_codetest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/vaporstream/android_codetest/di/ApplicationComponent;", "", "inject", "", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepositoryImpl;", "mainActivity", "Lcom/vaporstream/android_codetest/view/main/MainActivity;", "mainActivityViewModel", "Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel;", "userViewModel", "Lcom/vaporstream/android_codetest/viewmodel/user/UserViewModel;", "getStatesWorker", "Lcom/vaporstream/android_codetest/worker/GetStatesWorker;", "insertUserWorker", "Lcom/vaporstream/android_codetest/worker/InsertUserWorker;", "app_debug"})
@dagger.Component(modules = {com.vaporstream.android_codetest.di.modules.DatabaseModule.class, com.vaporstream.android_codetest.di.modules.RetrofitModule.class, com.vaporstream.android_codetest.di.modules.WorkerModule.class, com.vaporstream.android_codetest.di.modules.StatesModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.viewmodel.user.UserViewModel userViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.repository.UserRepositoryImpl userRepository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.worker.GetStatesWorker getStatesWorker);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.worker.InsertUserWorker insertUserWorker);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.view.main.MainActivity mainActivity);
}