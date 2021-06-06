package com.vaporstream.android_codetest.database.user;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'J\b\u0010\t\u001a\u00020\u0007H\'J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/vaporstream/android_codetest/database/user/UserDatabaseDao;", "", "get", "Lcom/vaporstream/android_codetest/model/User;", "key", "", "insert", "", "user", "remove", "update", "app_debug"})
public abstract interface UserDatabaseDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from user_table WHERE uid = :key")
    public abstract com.vaporstream.android_codetest.model.User get(long key);
    
    @androidx.room.Query(value = "DELETE FROM user_table")
    public abstract void remove();
}