package com.ajsherrell.photogallery

import android.net.Uri
import com.google.gson.annotations.SerializedName

// json data: https://api.flickr.com/services/rest/?method=flickr.interestingness.getList&api_key=2871aa667468e37bf001176635b8364b&format=json&nojsoncallback=1&extras=url_s
data class GalleryItem(
    var title: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = "",
    @SerializedName("owner") var owner: String = ""
) {
    val photoPageUri: Uri
        get() {
            return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(owner)
                .appendPath(id)
                .build()
        }
}