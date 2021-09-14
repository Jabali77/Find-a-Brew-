package com.vijanaweusi.model.api

import com.vijanaweusi.model.response.BrewsCategoryResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class BrewsWebService {
    private lateinit var api: BrewsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openbrewerydb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(BrewsApi::class.java)
    }

    suspend fun getBrews(): BrewsCategoryResponse {
        return api.getBrews()
    }

    interface BrewsApi {
        @GET ("breweries")
        suspend fun getBrews(): BrewsCategoryResponse
    }

}