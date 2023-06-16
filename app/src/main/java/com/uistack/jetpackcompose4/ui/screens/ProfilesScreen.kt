package com.uistack.jetpackcompose4.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uistack.jetpackcompose4.R
import com.uistack.jetpackcompose4.ui.Navigation.AppScreens
import com.uistack.jetpackcompose4.ui.theme.Poppins
import com.uistack.jetpackcompose4.ui.theme.Purple300
import com.uistack.jetpackcompose4.ui.theme.Purple500
import com.uistack.jetpackcompose4.ui.theme.Shapes

@Composable
fun ProfilesScreen(navController: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.image10),
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
            modifier = Modifier
                .width(1000.dp)
                .height(170.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(horizontal = 90.dp)
                .padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple500,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "ROL",
                fontFamily = Poppins,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.navigate(AppScreens.RegisterProfesionalScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(horizontal = 90.dp)
                .padding(top = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple300,
                contentColor = Color.White
            ),
            shape = Shapes.medium
        ) {
            Text(
                text = "PROFESIONAL",
                fontFamily = Poppins,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.navigate(AppScreens.RegisterScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(horizontal = 90.dp)
                .padding(top = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple300,
                contentColor = Color.White
            ),
            shape = Shapes.medium,
        ) {

            Text(
                text = "USUARIO",
                fontFamily = Poppins,
                fontSize = 25.sp,
                fontWeight = FontWeight.W300)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "PREMIUM",
            fontFamily = Poppins,
            fontSize = 25.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(text = "CONSULTA ESPECIALIZADA",
            fontFamily = Poppins,
            fontSize = 25.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {navController.navigate(AppScreens.PremiumScreen.route)},
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 60.dp)
                .padding(top = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple300,
                contentColor = Color.White
            ),
            shape = Shapes.medium,
        ) {

            Text(
                text = "Obtener más informacion",
                fontFamily = Poppins,
                fontSize = 16.sp,
                fontWeight = FontWeight.W300)
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun ProfilesScreenPreview(){
    JetpackCompose4Theme {
        ProfilesScreen(navController)
    }
}
 */