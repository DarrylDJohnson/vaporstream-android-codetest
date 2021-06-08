package com.vaporstream.android_codetest.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/vaporstream/android_codetest/repository/UserRepositoryImpl;", "Lcom/vaporstream/android_codetest/repository/UserRepository;", "()V", "userDao", "Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "getUserDao", "()Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "setUserDao", "(Lcom/vaporstream/android_codetest/database/UserDatabaseDao;)V", "getUser", "Lcom/vaporstream/android_codetest/model/User;", "uid", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "user", "(Lcom/vaporstream/android_codetest/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepositoryImpl implements com.vaporstream.android_codetest.repository.UserRepository {
    @javax.inject.Inject()
    public com.vaporstream.android_codetest.database.UserDatabaseDao userDao;
    
    public UserRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vaporstream.android_codetest.database.UserDatabaseDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.database.UserDatabaseDao p0) {
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