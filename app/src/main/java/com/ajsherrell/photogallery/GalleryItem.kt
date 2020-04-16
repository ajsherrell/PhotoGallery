package com.ajsherrell.photogallery

import com.google.gson.annotations.SerializedName

// json data: https://api.flickr.com/services/rest/?method=flickr.interestingness.getList&api_key=2871aa667468e37bf001176635b8364b&format=json&nojsoncallback=1&extras=url_s
data class GalleryItem(
    var title: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = ""
)