package com.example.pruebaandroid.domain

import com.example.pruebaandroid.data.CosaRepository

class GetCosasUseCase {

    private val repository = CosaRepository()

    suspend operator fun invoke() = repository.getAllCosas()
}
