package com.vaporstream.android_codetest.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vaporstream.android_codetest.model.User

@Dao
interface UserDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User): Long

    @Query("SELECT * from user_table WHERE uid = :key")
    suspend fun get(key: Long): User?

    @Query("DELETE FROM user_table")
    fun remove()
}