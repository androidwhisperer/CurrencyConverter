package com.whisperer.currencyconverter.repository
import com.whisperer.currencyconverter.data.Currency
import com.whisperer.currencyconverter.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyRepository private constructor() {

    // Private function to handle exchange rates internally
    private fun fetchExchangeRates(fromCurrency: String, toCurrency: String,amount: Double, callback: (Currency?) -> Unit = {} ){
        val call = RetrofitClient.apiService.getExchangeRates(fromCurrency, toCurrency, amount)

        // Asynchronously API call
        call.enqueue(object : Callback<Currency> {
            override fun onResponse(
                call: Call<Currency>,
                response: Response<Currency>
            ) {
                if (response.body()?.result == "success") {
                    val currencyData = response.body()
                    callback(currencyData)
                } else {
                    println("Error: ${response.code()}")
                    callback(null)
                }
            }

            override fun onFailure(call: Call<Currency>, t: Throwable) {

                callback(null)
            }
        })


    }

    companion object {
        // Public method to directly access getExchangeRates through the companion object
        fun getExchangeRates(fromCurrency: String, toCurrency: String, amount: Double ,callback: (Currency?) -> Unit = {}  ) {
            // Use a single instance for any other internal functions or shared state
            val instance = CurrencyRepository()
            instance.fetchExchangeRates(fromCurrency,toCurrency,amount,callback)
        }
    }
}
