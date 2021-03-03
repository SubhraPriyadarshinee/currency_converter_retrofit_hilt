package com.subhra.currencyconverterretrofithilt.main

import com.subhra.currencyconverterretrofithilt.data.models.CurrencyResponse
import com.subhra.currencyconverterretrofithilt.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}