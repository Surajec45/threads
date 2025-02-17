package com.example.threads.naviagation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.threads.screens.AddThreads
import com.example.threads.screens.BottomNav
import com.example.threads.screens.Home
import com.example.threads.screens.Login
import com.example.threads.screens.Profile
import com.example.threads.screens.Register
import com.example.threads.screens.Search
import com.example.threads.screens.Splash

@Composable
fun navgraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Splash.routes) {
        composable(Routes.Splash.routes){
            Splash(navController)
        }
        composable(Routes.Home.routes){
            Home()
        }
        composable(Routes.Login.routes){
            Login(navController)
        }
        composable(Routes.Register.routes){
            Register(navController)
        }
        composable(Routes.Search.routes){
            Search()
        }
        composable(Routes.Profile.routes){
            Profile()
        }
        composable(Routes.AddThread.routes){
            AddThreads()
        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }
    }
}
