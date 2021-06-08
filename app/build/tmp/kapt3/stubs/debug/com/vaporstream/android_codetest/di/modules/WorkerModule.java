package com.vaporstream.android_codetest.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/vaporstream/android_codetest/di/modules/WorkerModule;", "", "application", "Lcom/vaporstream/android_codetest/MyApplication;", "(Lcom/vaporstream/android_codetest/MyApplication;)V", "provideStates", "", "", "uuid", "Ljava/util/UUID;", "provideWorkManager", "Landroidx/work/WorkManager;", "app_debug"})
@dagger.Module()
public final class WorkerModule {
    private final com.vaporstream.android_codetest.MyApplication application = null;
    
    public WorkerModule(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.MyApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.work.WorkManager provideWorkManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.util.List<java.lang.String> provideStates(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
}