package com.example.nestednavigationincompose

sealed class Screen(val route: String) {
    object HomeScreen : Screen(route = "home_screen")
    object DetailScreen : Screen(route = "details_screen")
}