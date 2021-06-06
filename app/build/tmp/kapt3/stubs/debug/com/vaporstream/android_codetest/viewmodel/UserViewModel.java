package com.vaporstream.android_codetest.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010(\u001a\u00020%J\u0012\u0010)\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010*\u001a\u00020%R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\f\u00a8\u0006+"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/UserViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroidx/databinding/Observable;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_user", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vaporstream/android_codetest/model/User;", "addressOne", "", "getAddressOne", "()Landroidx/lifecycle/MutableLiveData;", "addressTwo", "getAddressTwo", "city", "getCity", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "getPhoneNumber", "state", "", "getState", "statesArray", "Landroidx/databinding/ObservableArrayList;", "getStatesArray", "()Landroidx/databinding/ObservableArrayList;", "user", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "zipCode", "getZipCode", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "clear", "removeOnPropertyChangedCallback", "submit", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.AndroidViewModel implements androidx.databinding.Observable {
    private final androidx.lifecycle.MutableLiveData<com.vaporstream.android_codetest.model.User> _user = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> firstName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> lastName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumber = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> addressOne = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> addressTwo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> city = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> state = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> zipCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableArrayList<java.lang.String> statesArray = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.vaporstream.android_codetest.model.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddressOne() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddressTwo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getZipCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<java.lang.String> getStatesArray() {
        return null;
    }
    
    public final void clear() {
    }
    
    public final void submit() {
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