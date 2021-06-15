package com.vaporstream.android_codetest.viewmodel.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "uid", "", "(J)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vaporstream/android_codetest/model/User;", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "getUserRepository", "()Lcom/vaporstream/android_codetest/repository/UserRepository;", "setUserRepository", "(Lcom/vaporstream/android_codetest/repository/UserRepository;)V", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.repository.UserRepository userRepository;
    private final androidx.lifecycle.MutableLiveData<com.vaporstream.android_codetest.model.User> _user = null;
    
    public UserViewModel(long uid) {
        super();
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
}