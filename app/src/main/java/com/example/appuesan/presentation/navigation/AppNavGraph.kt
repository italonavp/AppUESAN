package com.example.appuesan.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appuesan.presentation.Permissions.GalleryPermissionsScreen
import com.example.appuesan.presentation.auth.LoginScreen
import com.example.appuesan.presentation.auth.RegisterScreen
import com.example.appuesan.presentation.home.HomeScreen
import com.example.appuesan.presentation.realtime.FirestoreRealtimeScreen

@Composable
fun AppNavGraph(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "login")
    {
        composable("register"){ RegisterScreen(navController) }
        composable("login"){ LoginScreen(navController) }
        composable("home"){
            DraweScaffold(navController) {
                HomeScreen()
            }
        }
        composable("permissions"){
            DraweScaffold(navController) {
                GalleryPermissionsScreen()
            }
        }
        composable("realtime"){
            DraweScaffold(navController) {
                FirestoreRealtimeScreen()
            }
        }
    }
}