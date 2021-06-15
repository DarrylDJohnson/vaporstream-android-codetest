package com.vaporstream.android_codetest.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/vaporstream/android_codetest/di/modules/UserModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideUid", "Landroidx/lifecycle/LiveData;", "", "data", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/work/Data;", "provideUserDatabaseDao", "Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "provideUserRepository", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "provideUserWorkerInputData", "app_debug"})
@dagger.Module()
public final class UserModule {
    private final android.app.Application application = null;
    
    public UserModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vaporstream.android_codetest.database.UserDatabaseDao provideUserDatabaseDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.vaporstream.android_codetest.repository.UserRepository provideUserRepository() {
        return null;
    }
    
    /**
     * Provides a [MutableLiveData] object of type [Data].
     *
     * User data will be posted to this object from the view model.
     *
     * @returns a [MutableLiveData] object of type [Data], expected to hold user data to be inserted into the UserDatabase
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.lifecycle.MutableLiveData<androidx.work.Data> provideUserWorkerInputData() {
        return null;
    }
    
    /**
     * Observes [Data] [LiveData] for newly posted user data values.
     *
     * Builds and Observes a [androidx.work.WorkRequest] of type [InsertUserWorker]
     * to insert user data into the [UserDatabase]
     *
     * Observes a [androidx.work.WorkRequest]'s [androidx.work.WorkInfo] LiveData for newly posted
     * outputs from the [InsertUserWorker] request
     *
     * The info is expected to hold the generated uid returned when a
     * [com.vaporstream.android_codetest.model.User] is inserted into the [UserDatabaseDao].
     *
     * Extracts, converts and posts the uid value to a [LiveData] object of type [Long]
     *
     * @returns a LiveData object of type Long, expected to hold a uid
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.lifecycle.LiveData<java.lang.Long> provideUid(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<androidx.work.Data> data) {
        return null;
    }
}