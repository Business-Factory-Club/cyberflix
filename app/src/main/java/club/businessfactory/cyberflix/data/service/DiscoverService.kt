package club.businessfactory.cyberflix.data.service

import club.businessfactory.cyberflix.data.entity.ResultsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DiscoverService {

    @GET("discover/movie")
    suspend fun getResults(@Query("api_key") apiKey: String): ResultsResponse
}