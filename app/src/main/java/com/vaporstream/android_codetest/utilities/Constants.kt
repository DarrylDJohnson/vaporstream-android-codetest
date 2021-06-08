package com.vaporstream.android_codetest.utilities


object Constants {
    const val SELECT_A_STATE = "Select a State"
    const val BASE_URL: String = "https://api.jsonbin.io/"

    const val UID = "uid"
    const val FIRST_NAME = "first_name"
    const val LAST_NAME = "last_name"
    const val PHONE_NUMBER = "phone_number"
    const val ADDRESS_ONE = "address_one"
    const val ADDRESS_TWO = "address_two"
    const val CITY = "city"
    const val STATE = "state"
    const val ZIP_CODE = "zip_code"

    const val PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$"
    const val ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?\$"
}