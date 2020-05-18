package com.alirezaafkar.phuzei.data.repository

import com.alirezaafkar.phuzei.data.api.PhotosApi
import com.alirezaafkar.phuzei.data.model.FeatureFilter
import com.alirezaafkar.phuzei.data.model.Filter
import com.alirezaafkar.phuzei.data.model.Search
import com.alirezaafkar.phuzei.data.model.SearchResponse
import com.alirezaafkar.phuzei.util.applyNetworkSchedulers
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Alireza Afkar on 16/9/2018AD.
 */
class PhotosRepository @Inject constructor(private var api: PhotosApi) {
    fun getAlbumPhotos(albumId: String, pageToken: String? = null): Single<SearchResponse> {
        val fea = FeatureFilter(includedFeatures = listOf("FAVORITES"))
        val search = Search(pageToken = pageToken, filters = Filter(featureFilter =  fea))
        return api.getAlbumPhotos(search).compose(applyNetworkSchedulers())
    }

    fun getAlbumPhotosSync(albumId: String, pageToken: String? = null): SearchResponse? {
        val fea = FeatureFilter(includedFeatures = listOf("FAVORITES"))
        val search = Search(pageToken = pageToken, filters = Filter(featureFilter =  fea))
        return api.getAlbumPhotosCall(search).execute().body()
    }

    fun getPhotos(): Single<SearchResponse> {
        return api.getPhotos().compose(applyNetworkSchedulers())
    }
}
