package com.example.nestednavigationincompose.nav_graph

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.nestednavigationincompose.DETAIL_SCREEN_ID
import com.example.nestednavigationincompose.HOME_ROUTE
import com.example.nestednavigationincompose.Screen
import com.example.nestednavigationincompose.screens.DetailScreen
import com.example.nestednavigationincompose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navHostController: NavHostController
) {
    navigation(
        startDestination = Screen.HomeScreen.route,
        route = HOME_ROUTE
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