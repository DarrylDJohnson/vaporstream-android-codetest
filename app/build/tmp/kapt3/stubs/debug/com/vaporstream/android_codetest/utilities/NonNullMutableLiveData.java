package com.vaporstream.android_codetest.utilities;

import java.lang.System;

/**
 * https://proandroiddev.com/improving-livedata-nullability-in-kotlin-45751a2bafb7
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\n"}, d2 = {"Lcom/vaporstream/android_codetest/utilities/NonNullMutableLiveData;", "T", "Landroidx/lifecycle/LiveData;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "postValue", "", "setValue", "app_debug"})
public final class NonNullMutableLiveData<T extends java.lang.Object> extends androidx.lifecycle.LiveData<T> {
    
    public NonNullMutableLiveData(T value) {
        super(null);
    }
    
    @java.lang.Override()
    public T getValue() {
        return null;
    }
    
    @java.lang.Override()
    public void setValue(T value) {
    }
    
    @java.lang.Override()
    public void postValue(T value) {
    }
}