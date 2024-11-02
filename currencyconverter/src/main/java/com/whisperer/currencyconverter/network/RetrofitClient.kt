package com.whisperer.currencyconverter.network

import com.whisperer.currencyconverter.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitClient {
    private const val API_KEY = BuildConfig.API_KEY
    private const val BASE_URL = "https://v6.exchangerate-api.com/v6/$API_KEY/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // Provide the API service
    val apiService: CurrencyApiService by lazy {
        retrofit.create(CurrencyApiService::class.java)
    }
}
