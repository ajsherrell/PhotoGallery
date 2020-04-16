package com.ajsherrell.photogallery.api

import com.ajsherrell.photogallery.GalleryItem
import com.google.gson.annotations.SerializedName

class PhotoResponse {

    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>

}