package com.vaporstream.android_codetest.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object StatesService {
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.jsonbin.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}