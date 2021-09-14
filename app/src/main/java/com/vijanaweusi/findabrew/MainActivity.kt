package com.vijanaweusi.findabrew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vijanaweusi.findabrew.ui.breweries.BreweriesCategoriesScreen
import com.vijanaweusi.findabrew.ui.theme.FindABrewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindABrewTheme {
                BreweriesCategoriesScreen()
            }
        }
    }
}
