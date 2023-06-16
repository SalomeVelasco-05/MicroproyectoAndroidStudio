package com.uistack.jetpackcompose4.ui.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.uistack.jetpackcompose4.ui.screens.ContactScreen
import com.uistack.jetpackcompose4.ui.screens.HomeScreen
import com.uistack.jetpackcompose4.ui.screens.ProfileScreen
import com.uistack.jetpackcompose4.ui.screens.SettingsScreens
import com.uistack.jetpackcompose4.ui.screens.ShareScreen

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController, startDestination = NavigationItem.Home.route){
        composable(NavigationItem.Home.route){
            HomeScreen()
        }
        composable(NavigationItem.Profile.route){
            ProfileScreen()
        }
        composable(NavigationItem.Settings.route){
            SettingsScreens()
        }
        composable(NavigationItem.Share.route){
            ShareScreen()
        }
        composable(NavigationItem.Contact.route){
            ContactScreen()
        }
    }
}