package com.vaporstream.android_codetest.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vaporstream/android_codetest/di/modules/ApplicationModule;", "", "application", "Lcom/vaporstream/android_codetest/MyApplication;", "(Lcom/vaporstream/android_codetest/MyApplication;)V", "providesApplication", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.vaporstream.android_codetest.MyApplication application = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.MyApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.vaporstream.android_codetest.MyApplication providesApplication() {
        return null;
    }
}