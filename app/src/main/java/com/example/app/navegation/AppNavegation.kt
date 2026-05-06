package com.example.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.app.screen.DetailScreen
import com.example.app.screen.HomeScreen
import com.example.app.screen.ProfileScreen

@Composable
fun AppNavegation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(
                GoToDetail = {
                    navController.navigate("detail")
                }
            )
        }

        composable("detail") {
            DetailScreen(
                GoToProfile = {
                    navController.navigate("profile")
                },
                GoBackHome = {
                    navController.navigate("home") {
                        popUpTo("home") {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable("profile") {
            ProfileScreen(
                GoBackHome = {
                    navController.navigate("home") {
                        popUpTo("home") {
                            inclusive = true
                        }
                    }
                },
                GoBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}