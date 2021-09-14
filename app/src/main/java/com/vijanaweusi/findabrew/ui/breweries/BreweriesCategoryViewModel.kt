package com.vijanaweusi.findabrew.ui.breweries

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vijanaweusi.model.BreweriesRepository
import com.vijanaweusi.model.response.BrewsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BreweriesCategoryViewModel (private val repository: BreweriesRepository = BreweriesRepository()) :
    ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val brews = getBrews()
            brewsState.value = brews
        }
    }

    val brewsState: MutableState<List<BrewsResponse>> = mutableStateOf(emptyList<BrewsResponse>())

    private suspend fun getBrews(): List<BrewsResponse> {
        return repository.getBrews().brewLocations
    }
}