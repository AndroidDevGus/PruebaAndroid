package com.example.pruebaandroid.domain

import com.example.pruebaandroid.data.model.CosaModel
import com.example.pruebaandroid.data.model.CosaProvider

class GetRandomCosasUseCase {
    operator fun invoke(): CosaModel?{
        val cosas = CosaProvider.cosas
        if (!cosas.isNullOrEmpty()){
            val randomNumber = (cosas.indices).random()
            return cosas[randomNumber]
        }
        return null
    }
}
