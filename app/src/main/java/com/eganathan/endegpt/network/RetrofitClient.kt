package com.eganathan.endegpt.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitClient{

    companion object
    {
        var retrofit:Retrofit?=null;
        fun getRetrofitObject():Retrofit?
        {
            if(retrofit==null)
            {
                synchronized(RetrofitClient ::class.java)
                {
                    retrofit=Retrofit.Builder()
                        .addConverterFactory(MoshiConverterFactory.create())
                        .baseUrl("YOUR_BASE_URL")
                        .build()
                }
            }
            return retrofit

        }

    }
}