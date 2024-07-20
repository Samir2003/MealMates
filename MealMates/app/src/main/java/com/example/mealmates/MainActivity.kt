package com.example.mealmates

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mealmates.ui.theme.MealMatesTheme
import com.example.mealmates.ui.viewModels.LoginViewModel
import com.example.mealmates.ui.views.Login
import com.google.android.libraries.places.api.Places

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainViewModel: LoginViewModel by viewModels()
        mainViewModel.setContext(this)
        Places.initialize(this, BuildConfig.PLACES_API_KEY)
        val placesClient = Places.createClient(this)
        setContent {
            Login(mainViewModel, placesClient)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MealMatesTheme {
        Greeting("Android")
    }
}
