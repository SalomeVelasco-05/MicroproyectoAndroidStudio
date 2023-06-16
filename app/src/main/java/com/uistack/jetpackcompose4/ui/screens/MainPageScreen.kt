package com.uistack.jetpackcompose4.ui.screens

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uistack.jetpackcompose4.R
import com.uistack.jetpackcompose4.ui.Navigation.AppScreens
import com.uistack.jetpackcompose4.ui.theme.BackgroundColor
import com.uistack.jetpackcompose4.ui.theme.JetpackCompose4Theme
import com.uistack.jetpackcompose4.ui.theme.LightPrimaryColor
import com.uistack.jetpackcompose4.ui.theme.Poppins
import com.uistack.jetpackcompose4.ui.theme.Purple200
import com.uistack.jetpackcompose4.ui.theme.Purple700
import com.uistack.jetpackcompose4.ui.theme.Shapes

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainPageScreen(navController: NavHostController){
    Scaffold() {
        MainPageScreens(navController)
    }
}
@Composable
fun MainPageScreens(navController: NavHostController){
    Image(
        painter = painterResource(id = R.drawable.image7),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(450.dp)
            .height(850.dp))
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = null,
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "WELCOME",
            color = Purple700,
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.height(100.dp))
        Row() {
            OutlinedButton(onClick = {navController.navigate(AppScreens.OptionsScreen.route)},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Purple200
                ),
                shape = Shapes.medium
            ) {
                Text("INICIAR",
                    color = LightPrimaryColor,
                    fontFamily = Poppins,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}
