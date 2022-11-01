package com.alvic.photoapp.network

import com.alvic.photoapp.data.model.PhotoModel
import retrofit2.Response
import javax.inject.Inject

class Service @Inject constructor(private val apiClient: ApiClient) {

    companion object {
        private const val TAG = "Service"
    }

    suspend fun getPhotoListFromPage(page: Int): List<PhotoModel> =
        try {
            val result: Response<List<PhotoModel>?> = apiClient.getPhotosFromPage(page)
            result.body() ?: emptyList()
        } catch (ex: Exception) {
            emptyList()
        }
}