package com.vaporstream.android_codetest.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/vaporstream/android_codetest/di/modules/StatesModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideGetStatesRequestId", "Ljava/util/UUID;", "provideStateInterface", "Lcom/vaporstream/android_codetest/di/modules/StatesModule$StatesInterface;", "retrofit", "Lretrofit2/Retrofit;", "provideStates", "Landroidx/lifecycle/LiveData;", "", "", "id", "provideStatesWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "statesInterface", "StatesInterface", "app_debug"})
@dagger.Module()
public final class StatesModule {
    private final android.app.Application application = null;
    
    public StatesModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.vaporstream.android_codetest.di.modules.StatesModule.StatesInterface provideStateInterface(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Queues a work request to retrieve a list of states
     *
     * @returns the UUID of the queued work request
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "StatesWorkerId")
    @dagger.Provides()
    public final java.util.UUID provideGetStatesRequestId() {
        return null;
    }
    
    /**
     * Listens to a Retrofit http request for a string array of states
     *
     * @returns a Completer used to handle the GetStatesWorker Result based on the http request response
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> provideStatesWork(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.di.modules.StatesModule.StatesInterface statesInterface) {
        return null;
    }
    
    /**
     * Transforms WorkInfo as LiveData from a work request, used to retrieve a list of states,
     * with the id [id] into a string array as LiveData
     *
     * @returns string array of retrieved states as LiveData
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final androidx.lifecycle.LiveData<java.lang.String[]> provideStates(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "StatesWorkerId")
    java.util.UUID id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/vaporstream/android_codetest/di/modules/StatesModule$StatesInterface;", "", "getStates", "Lretrofit2/Call;", "", "", "app_debug"})
    public static abstract interface StatesInterface {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "/b/60770a3c5b165e19f6201b95")
        public abstract retrofit2.Call<java.util.List<java.lang.String>> getStates();
    }
}