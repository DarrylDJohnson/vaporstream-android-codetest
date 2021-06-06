package com.vaporstream.android_codetest.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010(\u001a\u00020%J\u0012\u0010)\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010*\u001a\u00020%Jj\u0010+\u001a\u00020\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0,2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0,2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0,2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0,2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0,2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170,2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0,H\u0002R$\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR$\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00170\u00170\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R$\u0010\"\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000b\u00a8\u0006."}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroidx/databinding/Observable;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "addressOne", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAddressOne", "()Landroidx/lifecycle/MutableLiveData;", "addressTwo", "getAddressTwo", "city", "getCity", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "getPhoneNumber", "state", "", "getState", "statesArray", "Landroidx/databinding/ObservableArrayList;", "getStatesArray", "()Landroidx/databinding/ObservableArrayList;", "submitEnabled", "Landroidx/lifecycle/MediatorLiveData;", "", "getSubmitEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "zipCode", "getZipCode", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "clear", "removeOnPropertyChangedCallback", "submit", "validate", "Landroidx/lifecycle/LiveData;", "Companion", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel implements androidx.databinding.Observable {
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
    @org.jetbrains.annotations.NotNull()
    public static final com.vaporstream.android_codetest.viewmodel.MainActivityViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "UserViewModel";
    private static final java.lang.String PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$";
    private static final java.lang.String ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?$";
    
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
    
    private final boolean validate(androidx.lifecycle.LiveData<java.lang.String> firstName, androidx.lifecycle.LiveData<java.lang.String> lastName, androidx.lifecycle.LiveData<java.lang.String> phoneNumber, androidx.lifecycle.LiveData<java.lang.String> addressOne, androidx.lifecycle.LiveData<java.lang.String> city, androidx.lifecycle.LiveData<java.lang.Integer> state, androidx.lifecycle.LiveData<java.lang.String> zipCode) {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/vaporstream/android_codetest/viewmodel/MainActivityViewModel$Companion;", "", "()V", "PHONE_REGEX", "", "TAG", "ZIP_CODE_REGEX", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}