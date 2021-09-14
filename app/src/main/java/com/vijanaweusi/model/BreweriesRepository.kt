package com.vijanaweusi.model

import com.vijanaweusi.model.api.BrewsWebService
import com.vijanaweusi.model.response.BrewsCategoryResponse

class BreweriesRepository (private val webService: BrewsWebService = BrewsWebService()) {
    suspend fun getBrews(): BrewsCategoryResponse {
        return webService.getBrews()
    }
}