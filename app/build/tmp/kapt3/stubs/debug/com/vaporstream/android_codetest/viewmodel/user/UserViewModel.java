package com.vaporstream.android_codetest.viewmodel.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "uid", "", "(J)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vaporstream/android_codetest/model/User;", "application", "Lcom/vaporstream/android_codetest/MyApplication;", "getApplication", "()Lcom/vaporstream/android_codetest/MyApplication;", "setApplication", "(Lcom/vaporstream/android_codetest/MyApplication;)V", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "getUserRepository", "()Lcom/vaporstream/android_codetest/repository/UserRepository;", "setUserRepository", "(Lcom/vaporstream/android_codetest/repository/UserRepository;)V", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "removeOnPropertyChangedCallback", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.MyApplication application;
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.repository.UserRepository userRepository;
    private final androidx.lifecycle.MutableLiveData<com.vaporstream.android_codetest.model.User> _user = null;
    
    public UserViewModel(long uid) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vaporstream.android_codetest.MyApplication getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.MyApplication p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vaporstream.android_codetest.repository.UserRepository getUserRepository() {
        return null;
    }
    
    public final void setUserRepository(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.repository.UserRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.vaporstream.android_codetest.model.User> getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
}