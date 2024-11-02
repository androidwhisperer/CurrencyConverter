package com.whisperer.currencyconverter.data

data class Currency(
    val result: String = "",
    val base_code: String = "",
    val target_code: String = "",
    val conversion_rate: Double = 0.0,
    val time_last_update_utc: String = "",
    val time_next_update_utc: String = "",
    val conversion_result: Double = 0.0
)
