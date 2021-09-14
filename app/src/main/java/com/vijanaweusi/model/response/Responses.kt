package com.vijanaweusi.model.response

data class BrewsCategoryResponse(val brewLocations: List<BrewsResponse>)

data class BrewsResponse(
        val id: String,
        val name: String,
        val city: String,
        val state: String
)