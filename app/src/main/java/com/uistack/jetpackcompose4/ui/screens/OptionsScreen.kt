package com.uistack.jetpackcompose4.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uistack.jetpackcompose4.R
import com.uistack.jetpackcompose4.ui.Navigation.AppScreens
import com.uistack.jetpackcompose4.ui.theme.LightPrimaryColor
import com.uistack.jetpackcompose4.ui.theme.Poppins
import com.uistack.jetpackcompose4.ui.theme.Purple200
import com.uistack.jetpackcompose4.ui.theme.Purple500
import com.uistack.jetpackcompose4.ui.theme.Shapes

@Composable
fun OptionsScreen(navController: NavHostController){
    Image(
        painter = painterResource(id = R.drawable.image8),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(400.dp)
            .height(850.dp))
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = null,
            modifier = Modifier.width(1000.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = {navController.navigate(AppScreens.LoginScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 90.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple500,
                contentColor = Color.White
            ),
            shape = Shapes.medium
        ) {

            Text(
                text = "INICIAR SESIÓN",
                fontFamily = Poppins,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(
            onClick = {navController.navigate(AppScreens.ProfilesScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 90.dp)
                .padding(top = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple500,
                contentColor = Color.White
            ),
            shape = Shapes.medium
        ) {
            Text(
                text = "REGISTRARSE",
                fontFamily = Poppins,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(1.dp))
        Button(
            onClick = {navController.navigate(AppScreens.MainPageScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 110.dp)
                .padding(top = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple500,
                contentColor = Color.White
            ),
            shape = Shapes.medium,
        ) {

            Text(
                text = "<",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.image1),
            contentDescription = null,
            modifier = Modifier.width(900.dp)
        )
    }
}