package com.vaporstream.android_codetest.viewmodel.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0006\u0010-\u001a\u00020*J\u0012\u0010.\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001c\u0010/\u001a\u00020*2\u0014\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020*01JS\u00103\u001a\u00020$2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\'\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u00104R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR$\u0010\r\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R$\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R$\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R$\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R$\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u001c0\u001c0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010\'\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0010\u00a8\u00065"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroidx/databinding/Observable;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_repository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "_statesArray", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "addressOne", "Landroidx/lifecycle/MutableLiveData;", "getAddressOne", "()Landroidx/lifecycle/MutableLiveData;", "addressTwo", "getAddressTwo", "city", "getCity", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "getPhoneNumber", "state", "", "getState", "statesArray", "Landroidx/databinding/ObservableArrayList;", "getStatesArray", "()Landroidx/databinding/ObservableArrayList;", "submitEnabled", "Landroidx/lifecycle/MediatorLiveData;", "", "getSubmitEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "zipCode", "getZipCode", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "clear", "removeOnPropertyChangedCallback", "submit", "onComplete", "Lkotlin/Function1;", "", "validate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Z", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel implements androidx.databinding.Observable {
    private final com.vaporstream.android_codetest.repository.UserRepository _repository = null;
    private final java.lang.String[] _statesArray = null;
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
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> submitEnabled = null;
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getSubmitEnabled() {
        return null;
    }
    
    private final boolean validate(java.lang.String firstName, java.lang.String lastName, java.lang.String phoneNumber, java.lang.String addressOne, java.lang.String city, java.lang.Integer state, java.lang.String zipCode) {
        return false;
    }
    
    public final void clear() {
    }
    
    public final void submit(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onComplete) {
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