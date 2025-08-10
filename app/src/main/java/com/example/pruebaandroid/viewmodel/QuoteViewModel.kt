package com.example.pruebaandroid.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pruebaandroid.model.CosaModel

class QuoteViewModel: ViewModel() {

    val cosaModel = MutableLiveData<CosaModel>()

    fun randomCosa(){
        val currentCosa = CosaProvider.random()
        cosaModel.postValue(currentCosa)
    }
}