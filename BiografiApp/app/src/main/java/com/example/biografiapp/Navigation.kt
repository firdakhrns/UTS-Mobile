package com.example.biografiapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onDetailClick = {
                navController.navigate("detail")
            })
        }
        composable("detail") {
            DetailScreen(navController = navController)
        }
    }
}