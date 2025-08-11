package com.example.pruebaandroid.data.network

import com.example.pruebaandroid.core.RetrofitHelper
import com.example.pruebaandroid.data.model.CosaModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCosas(): List<CosaModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllCosas()
            response.body() ?: emptyList()
    }
}
}

/*
* class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}
*
* */