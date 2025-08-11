package com.example.pruebaandroid.data

import com.example.pruebaandroid.data.model.CosaModel
import com.example.pruebaandroid.data.model.CosaProvider
import com.example.pruebaandroid.data.network.QuoteService
import javax.inject.Inject

class CosaRepository @Inject constructor(
    private val api: QuoteService,
    private val cosaProvider: CosaProvider) {

    suspend fun getAllCosas(): List<CosaModel>{
        val response = api.getCosas()
        cosaProvider.cosas = response
        return response
    }
}