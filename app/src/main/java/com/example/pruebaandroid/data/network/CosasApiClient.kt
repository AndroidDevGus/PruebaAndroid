package com.example.pruebaandroid.data.network

import com.example.pruebaandroid.data.model.CosaModel
import retrofit2.Response
import retrofit2.http.GET

interface CosasApiClient {
    @GET("/.json")
    suspend fun getAllCosas(): Response<List<CosaModel>>
}
