package com.vaporstream.android_codetest.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/vaporstream/android_codetest/repository/UserRepositoryImpl;", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "userDao", "Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "(Lcom/vaporstream/android_codetest/database/UserDatabaseDao;)V", "getUser", "Lcom/vaporstream/android_codetest/model/User;", "uid", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "user", "(Lcom/vaporstream/android_codetest/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepositoryImpl implements com.vaporstream.android_codetest.repository.UserRepository {
    private final com.vaporstream.android_codetest.database.UserDatabaseDao userDao = null;
    
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.database.UserDatabaseDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUser(long uid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vaporstream.android_codetest.model.User> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
}