package com.uistack.jetpackcompose4.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.uistack.jetpackcompose4.R
import com.uistack.jetpackcompose4.ui.theme.JetpackCompose4Theme
import com.uistack.jetpackcompose4.ui.theme.Poppins
import com.uistack.jetpackcompose4.ui.theme.Purple300
import com.uistack.jetpackcompose4.ui.theme.Shapes

@Composable
fun PremiumScreen(navController: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.image11),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .width(450.dp)
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
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "PREMIUM",
            fontFamily = Poppins,
            fontSize = 29.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(text = "CONSULTA ESPECIALIZADA",
            fontFamily = Poppins,
            fontSize = 29.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {},
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
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.image12),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.image13),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image14),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image15),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image16),
                contentDescription = null,
                modifier = Modifier.size(50.dp))}
        Row(modifier = Modifier.padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image17),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image19),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image20),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.image21),
                contentDescription = null,
                modifier = Modifier.size(50.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Purple300,
                contentColor = Color.White
            ),
            shape = Shapes.medium,
        ) {
            Text(
                text = "Otros medios de pago",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.W300)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Editar método de pago",
            fontFamily = Poppins,
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}


/*@Preview(showBackground = true)
@Composable
fun PremiumScreenPreview(){
    JetpackCompose4Theme {
        PremiumScreen(navController)
    }
}

 */