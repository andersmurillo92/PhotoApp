package com.alvic.photoapp.network

import com.alvic.photoapp.data.model.PhotoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET("albums/{page}/photos")
    suspend fun getPhotosFromPage(@Path("page") page: Int): Response<List<PhotoModel>?>
}