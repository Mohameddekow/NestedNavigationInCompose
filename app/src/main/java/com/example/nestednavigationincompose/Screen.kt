package com.example.nestednavigationincompose

const val DETAIL_SCREEN_ID = "id"
const val ROOT_ROUTE = "route_root"
const val HOME_ROUTE = "route_home"
const val AUTH_ROUTE = "route_auth"

sealed class Screen(val route: String) {

    object HomeScreen : Screen(route = "home_screen")

    object LoginScreen : Screen(route = "login_screen")

    object SignUpScreen : Screen(route = "sing_up_screen")

    object DetailScreen : Screen(route = "details_screen/{$DETAIL_SCREEN_ID}") {
        fun passId(id: Int): String {
            return this.route.replace(oldValue = "{$DETAIL_SCREEN_ID}", newValue = id.toString())

//            return "detail_screen/$id"
        }
    }
}