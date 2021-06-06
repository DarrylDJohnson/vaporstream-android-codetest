package com.vaporstream.android_codetest.database.user;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/vaporstream/android_codetest/database/user/UserDatabaseDao;", "", "()V", "get", "Lcom/vaporstream/android_codetest/model/User;", "key", "", "insert", "", "user", "remove", "update", "app_debug"})
public final class UserDatabaseDao {
    
    public UserDatabaseDao() {
        super();
    }
    
    @androidx.room.Insert()
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user) {
    }
    
    @androidx.room.Update()
    public final void update(@org.jetbrains.annotations.NotNull()
    com.vaporstream.android_codetest.model.User user) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from user_table WHERE uid = :key")
    public final com.vaporstream.android_codetest.model.User get(long key) {
        return null;
    }
    
    @androidx.room.Query(value = "DELETE FROM user_table")
    public final void remove() {
    }
}