package com.whisperer.currencyconverter.network

import com.whisperer.currencyconverter.data.Currency
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface CurrencyApiService {

    @GET("pair/{from}/{to}/{amount}")
    fun getExchangeRates(@Path("from") from: String, @Path("to") to: String, @Path("amount") currency: Double): Call<Currency>
}