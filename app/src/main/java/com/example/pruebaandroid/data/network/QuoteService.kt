package com.example.pruebaandroid.data.network

import com.example.pruebaandroid.data.model.CosaModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class QuoteService @Inject constructor(private val api: CosasApiClient){

    suspend fun getCosas(): List<CosaModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllCosas()
            response.body() ?: emptyList()
        }
    }
}
