package com.vaporstream.android_codetest.viewmodel.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0006\u00108\u001a\u000205J\u0006\u00109\u001a\u000205J\u0012\u0010:\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0006\u0010;\u001a\u00020<JS\u0010=\u001a\u00020)2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010>R$\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR$\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR$\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u001b0\u001b0\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\t\u00a8\u0006@"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "()V", "addressOne", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAddressOne", "()Landroidx/lifecycle/MutableLiveData;", "addressTwo", "getAddressTwo", "application", "Lcom/vaporstream/android_codetest/MyApplication;", "getApplication", "()Lcom/vaporstream/android_codetest/MyApplication;", "setApplication", "(Lcom/vaporstream/android_codetest/MyApplication;)V", "city", "getCity", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "getPhoneNumber", "state", "", "getState", "states", "Landroidx/databinding/ObservableArrayList;", "getStates", "()Landroidx/databinding/ObservableArrayList;", "statesInterface", "Lcom/vaporstream/android_codetest/utilities/StatesInterface;", "getStatesInterface", "()Lcom/vaporstream/android_codetest/utilities/StatesInterface;", "setStatesInterface", "(Lcom/vaporstream/android_codetest/utilities/StatesInterface;)V", "submitEnabled", "Landroidx/lifecycle/MediatorLiveData;", "", "getSubmitEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "userRepository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "getUserRepository", "()Lcom/vaporstream/android_codetest/repository/UserRepository;", "setUserRepository", "(Lcom/vaporstream/android_codetest/repository/UserRepository;)V", "zipCode", "getZipCode", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "clear", "dummyData", "removeOnPropertyChangedCallback", "submit", "Ljava/util/UUID;", "validate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Z", "Companion", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.MyApplication application;
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.repository.UserRepository userRepository;
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.utilities.StatesInterface statesInterface;
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
    private final androidx.databinding.ObservableArrayList<java.lang.String> states = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> submitEnabled = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "MainActivityViewModel";
    
    public MainActivityViewModel() {
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
    public final com.vaporstream.android_codetest.utilities.StatesInterface getStatesInterface() {
        return null;
    }
    
    public final void setStatesInterface(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.utilities.StatesInterface p0) {
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
    public final androidx.databinding.ObservableArrayList<java.lang.String> getStates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getSubmitEnabled() {
        return null;
    }
    
    private final boolean validate(java.lang.String firstName, java.lang.String lastName, java.lang.String phoneNumber, java.lang.String addressOne, java.lang.String city, java.lang.Integer state, java.lang.String zipCode) {
        return false;
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID submit() {
        return null;
    }
    
    public final void dummyData() {
    }
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}