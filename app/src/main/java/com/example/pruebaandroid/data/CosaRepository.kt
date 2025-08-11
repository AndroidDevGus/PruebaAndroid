package com.example.pruebaandroid.data

import com.example.pruebaandroid.data.model.CosaModel
import com.example.pruebaandroid.data.model.CosaProvider
import com.example.pruebaandroid.data.network.QuoteService

class CosaRepository {
    //private val api =
    private val api = QuoteService()

    suspend fun getAllCosas(): List<CosaModel>{
        val response = api.getCosas()
        CosaProvider.cosas = response
        return response
    }
}
/*
* class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
*}
* */