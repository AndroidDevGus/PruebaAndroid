package com.example.pruebaandroid.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebaandroid.data.model.CosaModel
import com.example.pruebaandroid.domain.GetCosasUseCase
import com.example.pruebaandroid.domain.GetRandomCosasUseCase
import kotlinx.coroutines.launch

class QuoteViewModel: ViewModel() {

    val cosaModel = MutableLiveData<CosaModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getCosasUseCase = GetCosasUseCase()
    var getRandomCosasUseCase = GetRandomCosasUseCase()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getCosasUseCase()

            if (!result.isNullOrEmpty()){
                cosaModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomCosa(){
        isLoading.postValue(true)
        val cosa = getRandomCosasUseCase()
        if (cosa != null){
            cosaModel.postValue(cosa)
        }
        isLoading.postValue(false)
    }
}
