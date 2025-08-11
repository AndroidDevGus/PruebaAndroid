package com.example.pruebaandroid.domain

import com.example.pruebaandroid.data.CosaRepository
import javax.inject.Inject

class GetCosasUseCase @Inject constructor(private val repository: CosaRepository){

    suspend operator fun invoke() = repository.getAllCosas()
}
