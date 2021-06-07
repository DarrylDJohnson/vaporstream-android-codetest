package com.vaporstream.android_codetest.utilities

import retrofit2.Call
import retrofit2.http.GET

interface StatesInterface {
    @GET("/b/60770a3c5b165e19f6201b95")
    fun getStates(): Call<List<String>>
}