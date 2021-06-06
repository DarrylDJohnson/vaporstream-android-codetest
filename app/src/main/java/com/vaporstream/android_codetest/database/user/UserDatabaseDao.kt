package com.vaporstream.android_codetest.database.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.vaporstream.android_codetest.model.User

@Dao
class UserDatabaseDao {

    @Insert
    fun insert(user: User) {
    }

    @Update
    fun update(user: User) {
    }

    @Query("SELECT * from user_table WHERE uid = :key")
    fun get(key: Long): User? {
        return null;
    }

    @Query("DELETE FROM user_table")
    fun remove(){}
}