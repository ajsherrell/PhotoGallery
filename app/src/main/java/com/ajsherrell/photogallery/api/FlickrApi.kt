package com.ajsherrell.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    //gets flickr homepage in HTML
//    @GET("/")
//    fun fetchContents(): Call<String>

    //gets JSON response
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=2871aa667468e37bf001176635b8364b" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}