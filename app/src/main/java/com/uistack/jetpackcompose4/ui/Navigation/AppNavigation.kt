package com.uistack.jetpackcompose4.ui.Navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uistack.jetpackcompose4.ui.screens.ForgotPasswordScreen
import com.uistack.jetpackcompose4.ui.screens.LoginScreen
import com.uistack.jetpackcompose4.ui.screens.MainPageScreen
import com.uistack.jetpackcompose4.ui.screens.MainScreen
import com.uistack.jetpackcompose4.ui.screens.OptionsScreen
import com.uistack.jetpackcompose4.ui.screens.PremiumScreen
import com.uistack.jetpackcompose4.ui.screens.ProfilesScreen
import com.uistack.jetpackcompose4.ui.screens.RegisterProfesionalScreen
import com.uistack.jetpackcompose4.ui.screens.RegisterScreen
import com.uistack.jetpackcompose4.ui.screens.SettingsScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainPageScreen.route) {
        composable(AppScreens.MainPageScreen.route) {
            MainPageScreen(navController)
        }
        composable(AppScreens.OptionsScreen.route) {
            OptionsScreen(navController)
        }
        composable(AppScreens.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(AppScreens.RegisterScreen.route) {
            RegisterScreen(navController)
        }
        composable(AppScreens.ForgotPasswordScreen.route) {
            ForgotPasswordScreen(navController)
        }
        composable(AppScreens.SettingsScreen.route) {
            SettingsScreen(navController)
        }
        composable(AppScreens.RegisterProfesionalScreen.route) {
            RegisterProfesionalScreen(navController)
        }
        composable(AppScreens.ProfilesScreen.route) {
            ProfilesScreen(navController)
        }
        composable(AppScreens.PremiumScreen.route) {
            PremiumScreen(navController)
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen(navController)
        }
    }
}