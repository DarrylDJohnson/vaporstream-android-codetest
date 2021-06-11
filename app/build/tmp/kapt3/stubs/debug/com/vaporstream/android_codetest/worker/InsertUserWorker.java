package com.vaporstream.android_codetest.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/vaporstream/android_codetest/worker/InsertUserWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "userDatabaseDao", "Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "getUserDatabaseDao", "()Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "setUserDatabaseDao", "(Lcom/vaporstream/android_codetest/database/UserDatabaseDao;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_debug"})
public final class InsertUserWorker extends androidx.work.Worker {
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.database.UserDatabaseDao userDatabaseDao;
    
    public InsertUserWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vaporstream.android_codetest.database.UserDatabaseDao getUserDatabaseDao() {
        return null;
    }
    
    public final void setUserDatabaseDao(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.database.UserDatabaseDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
}