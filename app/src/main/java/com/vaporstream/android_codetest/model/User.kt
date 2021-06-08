package com.vaporstream.android_codetest.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vaporstream.android_codetest.utilities.Constants

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Long?,

    @ColumnInfo(name = Constants.FIRST_NAME)
    var firstName: String,

    @ColumnInfo(name = Constants.LAST_NAME)
    var lastName: String,

    @ColumnInfo(name = Constants.PHONE_NUMBER)
    var phoneNumber: String,

    @ColumnInfo(name = Constants.ADDRESS_ONE)
    var addressOne: String,

    @ColumnInfo(name = Constants.ADDRESS_TWO)
    var addressTwo: String?,

    @ColumnInfo(name = Constants.CITY)
    var city: String,

    @ColumnInfo(name = Constants.STATE)
    var state: String,

    @ColumnInfo(name = Constants.ZIP_CODE)
    var zipCode: String,
) {
    constructor(
        firstName: String,
        lastName: String,
        phoneNumber: String,
        addressOne: String,
        addressTwo: String?,
        city: String,
        state: String,
        zipCode: String,
    ) : this(null, firstName, lastName, phoneNumber, addressOne, addressTwo, city, state, zipCode)
}