package com.example.nestednavigationincompose.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.nestednavigationincompose.HOME_ROUTE
import com.example.nestednavigationincompose.ROOT_ROUTE

@Composable
fun SetUpNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navHostController = navHostController)
        authNavGraph(navHostController = navHostController)
    }
}