package com.example.pruebaandroid.domain

import com.example.pruebaandroid.data.model.CosaModel
import com.example.pruebaandroid.data.model.CosaProvider
import javax.inject.Inject

class GetRandomCosasUseCase @Inject constructor(private val cosaProvider: CosaProvider) {

    operator fun invoke(): CosaModel?{
        val cosas = cosaProvider.cosas
        if (!cosas.isNullOrEmpty()){
            val randomNumber = (cosas.indices).random()
            return cosas[randomNumber]
        }
        return null
    }

}
