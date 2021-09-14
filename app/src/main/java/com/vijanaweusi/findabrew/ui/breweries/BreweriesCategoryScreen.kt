package com.vijanaweusi.findabrew.ui.breweries

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.vijanaweusi.findabrew.ui.theme.FindABrewTheme
import com.vijanaweusi.model.response.BrewsResponse

@ExperimentalCoilApi
@Composable
fun BreweriesCategoriesScreen() {
    val viewModel: BreweriesCategoryViewModel = viewModel()
    val brews = viewModel.brewsState.value
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(brews) { brew ->
            BrewCategory(brew)

        }
    }

}

@ExperimentalCoilApi
@Composable
fun BrewCategory(brew: BrewsResponse) {

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row {

            // Image
            Image(
                painter = rememberImagePainter(data = null),
                contentDescription = null,
                modifier = Modifier
                    .size(88.dp)
                    .padding(4.dp)
            )


            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(16.dp)
            ) {
                Text(
                    text = brew.name,
                    style = MaterialTheme.typography.h6
                )

            }
        }
    }
}


@ExperimentalCoilApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FindABrewTheme {

        BreweriesCategoriesScreen()
    }
}
