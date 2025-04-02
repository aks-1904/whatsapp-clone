package com.akshay.whatsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.akshay.whatsapp.presentation.calls_screen.CallScreen
import com.akshay.whatsapp.presentation.community_screen.CommunityScreen
import com.akshay.whatsapp.presentation.home_screen.HomeScreen
import com.akshay.whatsapp.presentation.splash_screen.SplashScreen
import com.akshay.whatsapp.presentation.update_screen.UpdateScreen
import com.akshay.whatsapp.presentation.user_registration_screen.UserRegistrationScreen
import com.akshay.whatsapp.presentation.welcome_screen.WelcomeScreen

@Composable
fun NavigationSystem(){
    val navController = rememberNavController()

    NavHost(startDestination = Routes.SplashScreen, navController = navController){

        composable<Routes.SplashScreen>{
            SplashScreen(navController)
        }

        composable<Routes.WelcomeScreen>{
            WelcomeScreen(navController)
        }

        composable<Routes.UserRegistrationScreen>{
            UserRegistrationScreen()
        }

        composable<Routes.HomeScreen>{
            HomeScreen()
        }

        composable<Routes.CommunityScreen>{
            CommunityScreen()
        }

        composable<Routes.UpdateScreen>{
            UpdateScreen()
        }

        composable<Routes.CallScreen>{
            CallScreen()
        }

    }
}