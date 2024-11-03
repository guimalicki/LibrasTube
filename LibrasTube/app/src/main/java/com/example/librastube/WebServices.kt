package com.example.librastube

import retrofit2.Response
import retrofit2.http.GET

interface WebServices {

    @GET("search?part=snippet&eventtype=completed&q=podcasts&type=video&key=AIzaSyDp-44MwsCV0qfCigxQl8njpIFdcpTGuDg")
    suspend fun buscarVideos(): Response<ResponseAPI>
}