package com.example.nestednavigationincompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigationincompose.AUTH_ROUTE
import com.example.nestednavigationincompose.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "Home",
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 20.dp)
                    .clickable {
                        navController.navigate(route = Screen.DetailScreen.passId(4))
                    },
                color = Color.Blue,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )

        }

        Text(
            text = "Login/Sign Up",
            color = Color.Red,
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(AUTH_ROUTE)
                }
                .padding(horizontal = 10.dp, vertical = 30.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPre() {
    HomeScreen(navController = rememberNavController())
}