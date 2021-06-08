package com.vaporstream.android_codetest.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/vaporstream/android_codetest/worker/GetStatesWorker;", "Landroidx/work/ListenableWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "statesWork", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "getStatesWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "setStatesWork", "(Lcom/google/common/util/concurrent/ListenableFuture;)V", "startWork", "app_debug"})
public final class GetStatesWorker extends androidx.work.ListenableWorker {
    @javax.inject.Inject()
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> statesWork;
    
    public GetStatesWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> getStatesWork() {
        return null;
    }
    
    public final void setStatesWork(@org.jetbrains.annotations.NotNull()
    com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
        return null;
    }
}