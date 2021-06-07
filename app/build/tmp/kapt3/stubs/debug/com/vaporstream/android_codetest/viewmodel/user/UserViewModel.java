package com.vaporstream.android_codetest.viewmodel.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "uid", "", "(Lcom/vaporstream/android_codetest/repository/UserRepository;J)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vaporstream/android_codetest/model/User;", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "removeOnPropertyChangedCallback", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    private final androidx.lifecycle.MutableLiveData<com.vaporstream.android_codetest.model.User> _user = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.repository.UserRepository userRepository, long uid) {
        super();
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