package com.vaporstream.android_codetest.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/vaporstream/android_codetest/database/UserDatabaseDao;", "", "get", "Lcom/vaporstream/android_codetest/model/User;", "key", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "user", "app_debug"})
public abstract interface UserDatabaseDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from user_table WHERE uid = :key")
    public abstract java.lang.Object get(long key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vaporstream.android_codetest.model.User> p1);
}