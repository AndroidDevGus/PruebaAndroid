package com.example.pruebaandroid.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CosaProvider @Inject constructor(){

    var cosas: List<CosaModel> = emptyList()

}