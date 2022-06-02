package com.example.nestednavigationincompose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetUpNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navHostController)
        }
        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(navArgument(DETAIL_SCREEN_ID) {
                type = NavType.IntType
            })
        ) {
            Log.d("Details args", it.arguments?.getInt(DETAIL_SCREEN_ID).toString())
            DetailScreen(navController = navHostController)
        }
    }
}