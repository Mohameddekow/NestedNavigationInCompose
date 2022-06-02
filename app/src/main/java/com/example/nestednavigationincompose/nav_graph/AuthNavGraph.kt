package com.example.nestednavigationincompose.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationincompose.AUTH_ROUTE
import com.example.nestednavigationincompose.Screen
import com.example.nestednavigationincompose.screens.LoginScreen
import com.example.nestednavigationincompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navHostController: NavHostController
) {
    navigation(
        startDestination = Screen.LoginScreen.route,
        route = AUTH_ROUTE
    ) {
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen(navHostController)
        }

        composable(
            route = Screen.SignUpScreen.route
        ) {
            SignUpScreen(navHostController)
        }
    }
}