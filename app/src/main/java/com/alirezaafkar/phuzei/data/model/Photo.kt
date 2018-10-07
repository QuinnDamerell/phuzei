package com.alirezaafkar.phuzei.data.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id") val id: String,
    @SerializedName("baseUrl") val baseUrl: String,
    @SerializedName("mimeType") val mimeType: String,
    @SerializedName("filename") val filename: String,
    @SerializedName("productUrl") val productUrl: String,
    @SerializedName("description") val description: String
)
