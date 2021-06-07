package com.vaporstream.android_codetest.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/vaporstream/android_codetest/services/JsonBinEndpoints;", "", "getStates", "Lretrofit2/Call;", "", "", "app_debug"})
public abstract interface JsonBinEndpoints {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/b/60770a3c5b165e19f6201b95")
    public abstract retrofit2.Call<java.util.List<java.lang.String>> getStates();
}