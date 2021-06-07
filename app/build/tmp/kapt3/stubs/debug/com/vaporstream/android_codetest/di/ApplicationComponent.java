package com.vaporstream.android_codetest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/vaporstream/android_codetest/di/ApplicationComponent;", "", "inject", "", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepositoryImpl;", "activity", "Lcom/vaporstream/android_codetest/view/main/MainActivity;", "Lcom/vaporstream/android_codetest/view/results/ResultsActivity;", "mainActivityViewModel", "Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel;", "userViewModel", "Lcom/vaporstream/android_codetest/viewmodel/user/UserViewModel;", "app_debug"})
@dagger.Component(modules = {com.vaporstream.android_codetest.di.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.view.main.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.view.results.ResultsActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.viewmodel.user.UserViewModel userViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.repository.UserRepositoryImpl userRepository);
}