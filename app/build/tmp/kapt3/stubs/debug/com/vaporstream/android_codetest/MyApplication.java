package com.vaporstream.android_codetest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/vaporstream/android_codetest/MyApplication;", "Landroid/app/Application;", "()V", "applicationComponent", "Lcom/vaporstream/android_codetest/di/ApplicationComponent;", "getApplicationComponent", "()Lcom/vaporstream/android_codetest/di/ApplicationComponent;", "setApplicationComponent", "(Lcom/vaporstream/android_codetest/di/ApplicationComponent;)V", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application {
    public com.vaporstream.android_codetest.di.ApplicationComponent applicationComponent;
    @org.jetbrains.annotations.NotNull()
    public static final com.vaporstream.android_codetest.MyApplication.Companion Companion = null;
    private static com.vaporstream.android_codetest.MyApplication INSTANCE;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vaporstream.android_codetest.di.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public final void setApplicationComponent(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.di.ApplicationComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.vaporstream.android_codetest.MyApplication get() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vaporstream/android_codetest/MyApplication$Companion;", "", "()V", "INSTANCE", "Lcom/vaporstream/android_codetest/MyApplication;", "get", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vaporstream.android_codetest.MyApplication get() {
            return null;
        }
    }
}