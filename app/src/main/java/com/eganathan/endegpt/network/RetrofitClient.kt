package com.eganathan.endegpt.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {
    private val retrofitInstance: Retrofit? = getInstance()
    fun getInstance(): Retrofit {
        lateinit var retrofit: Retrofit

        if (retrofitInstance == null)
            retrofit = retrofit2.Retrofit.Builder().baseUrl("https://reqres.in")
                .addConverterFactory(MoshiConverterFactory.create()).build()
        else retrofitInstance

        return retrofit
    }

}