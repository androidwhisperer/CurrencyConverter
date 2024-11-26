package com.whisperer.currencyconverter.data

object CurrencyConverterConfig {
    private var apiKey: String? = null

    fun setApiKey(key: String) {
        apiKey = key
    }
    fun getApiKey(): String {
        return apiKey ?: throw IllegalStateException("API Key is not set")
    }
}