package com.example.navigation1.presentation.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation1.presentation.ui.screens.Screen1
import com.example.navigation1.presentation.ui.screens.Screen2
import com.example.navigation1.presentation.ui.screens.Screen3

// El startDestination define la pantalla que se cargará cuando se abre la aplicación
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(startDestination: String = Screen.Screen1.route) {
    // Cargamos el navController
    val navController = rememberNavController()

    // Creamos un NavHost que arranque con la pantalla de inicio
    NavHost(navController = navController, startDestination = startDestination) {

        composable(Screen.Screen1.route) {
            Screen1(navController)
        }

        composable(Screen.Screen2.route) {
            Screen2(navController)
        }

        composable(Screen.Screen3.route) {
            Screen3(navController)
        }

    }

}