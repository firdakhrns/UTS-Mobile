package com.example.biografiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.biografiapp.ui.theme.BiografiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BiografiAppTheme {
                val navController = rememberNavController()
                NavigationGraph(navController = navController)
            }
        }
    }
}