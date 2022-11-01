package com.alvic.photoapp.data.model

import java.io.Serializable

data class PhotoModel(
    val albumId: Int? = null,
    val id: Int? = null,
    var title: String = "",
    val url: String = "",
    val thumbnailUrl: String = "",
): Serializable