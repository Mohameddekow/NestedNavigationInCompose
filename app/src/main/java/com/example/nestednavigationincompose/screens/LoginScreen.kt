package com.example.nestednavigationincompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nestednavigationincompose.HOME_ROUTE
import com.example.nestednavigationincompose.Screen

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Login Screen",
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            color = Color.Magenta,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(Screen.SignUpScreen.route)
                }
                .padding(horizontal = 50.dp, vertical = 30.dp))

        Text(
            text = "Go Back",
            fontSize = 25.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
//                    navController.popBackStack() or
                    navController.navigate(HOME_ROUTE) { popUpTo(HOME_ROUTE) }
                }
                .padding(horizontal = 50.dp, vertical = 5.dp))
    }
}