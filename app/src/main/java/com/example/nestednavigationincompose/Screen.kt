package com.example.nestednavigationincompose

const val DETAIL_SCREEN_ID = "id"
sealed class Screen(val route: String) {

    object HomeScreen : Screen(route = "home_screen")
    object DetailScreen : Screen(route = "details_screen/{$DETAIL_SCREEN_ID}") {
        fun passId(id: Int): String {
//            return this.route.replace(oldValue ="{$DETAIL_SCREEN_ID}" , newValue = id.toString())

            return "detail_screen/$id"
        }
    }
}