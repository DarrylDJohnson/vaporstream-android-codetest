package com.vaporstream.android_codetest.model

data class User(
        val firstName: String,      //required
        val lastName: String,       //required
        var phoneNumber: String?,
        val addressOne: String,     //required
        var addressTwo: String?,
        val city: String,           //required
        val state: String,          //required
        val zipCode: String,        //required
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