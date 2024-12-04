package com.example.navigation1.presentation.navigation

sealed class Screen(val route: String) {
    // Definimos la pantalla 1 en la ruta home
    object Screen1 : Screen("Screen1")
    //  Definimos la pantalla 2 en la ruta login
    object Screen2 : Screen("Screen2")
    //  Definimos la pantalla 3 en la ruta login
    object Screen3 : Screen("Screen3")
}