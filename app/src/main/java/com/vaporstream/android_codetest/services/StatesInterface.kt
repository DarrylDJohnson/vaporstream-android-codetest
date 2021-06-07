package com.vaporstream.android_codetest.services

import com.vaporstream.android_codetest.model.States
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StatesInterface {

    @GET("https://api.jsonbin.io/b/60770a3c5b165e19f6201b95")
    fun getStates(@Query("api_ket") key: String): Call<States>
}