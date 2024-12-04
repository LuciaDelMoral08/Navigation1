package com.example.navigation1.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.presentation.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Pantalla 2") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center
        ) {

            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Volver")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navController.navigate(Screen.Screen3.route) }) {
                Text(text = "Pantalla 3")
            }
        }
    }
}

@Preview
@Composable
fun preview2(){
    Screen2(rememberNavController())
}