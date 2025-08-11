package com.example.pruebaandroid.data.model

import com.google.gson.annotations.SerializedName

data class CosaModel (
    @SerializedName("quote") val name:String,
    @SerializedName("author") val decription:String)

