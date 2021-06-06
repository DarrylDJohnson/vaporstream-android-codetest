package com.vaporstream.android_codetest.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(

        @PrimaryKey(autoGenerate = true)
        val id: String,

        @ColumnInfo(name = FIRST_NAME)
        val firstName: String,

        @ColumnInfo(name = LAST_NAME)
        val lastName: String,

        @ColumnInfo(name = PHONE_NUMBER)
        var phoneNumber: String,

        @ColumnInfo(name = ADDRESS_ONE)
        val addressOne: String,

        @ColumnInfo(name = ADDRESS_TWO)
        var addressTwo: String,

        @ColumnInfo(name = CITY)
        val city: String,

        @ColumnInfo(name = STATE)
        val state: String,

        @ColumnInfo(name = ZIPCODE)
        val zipCode: String,
) {
    companion object {
        private const val FIRST_NAME = "first_name"
        private const val LAST_NAME = "last_name"
        private const val PHONE_NUMBER = "phone_number"
        private const val ADDRESS_ONE = "address_one"
        private const val ADDRESS_TWO = "address_two"
        private const val CITY = "city"
        private const val STATE = "state"
        private const val ZIPCODE = "zipcode"
    }
}