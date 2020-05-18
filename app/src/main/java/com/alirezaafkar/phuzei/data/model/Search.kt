package com.alirezaafkar.phuzei.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Alireza Afkar on 14/9/2018AD.
 */
data class FeatureFilter(
        @SerializedName("includedFeatures") val includedFeatures: List<String>
)
data class Filter(
        @SerializedName("featureFilter") val featureFilter: FeatureFilter
        )

data class Search(
        @SerializedName("filters") val filters: Filter,
    @SerializedName("pageSize") val pageSize: Int = 100,
    @SerializedName("pageToken") val pageToken: String? = null
)
