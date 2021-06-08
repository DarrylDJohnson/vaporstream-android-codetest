package com.vaporstream.android_codetest.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\r\u001a\n\u0010\u000f\u001a\u00020\f*\u00020\r\u00a8\u0006\u0010"}, d2 = {"addSources", "", "T", "Landroidx/lifecycle/MediatorLiveData;", "sources", "", "Landroidx/lifecycle/LiveData;", "", "onChanged", "Lkotlin/Function1;", "(Landroidx/lifecycle/MediatorLiveData;[Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V", "isNotNullOrBlank", "", "", "matchesPhoneNumber", "matchesZipCode", "app_debug"})
public final class ExtensionsKt {
    
    public static final <T extends java.lang.Object>void addSources(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<T> $this$addSources, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<? extends java.lang.Object>[] sources, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onChanged) {
    }
    
    public static final boolean isNotNullOrBlank(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isNotNullOrBlank) {
        return false;
    }
    
    public static final boolean matchesZipCode(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$matchesZipCode) {
        return false;
    }
    
    public static final boolean matchesPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$matchesPhoneNumber) {
        return false;
    }
}