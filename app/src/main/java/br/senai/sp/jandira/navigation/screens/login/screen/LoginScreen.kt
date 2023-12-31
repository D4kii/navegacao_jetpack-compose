package br.senai.sp.jandira.navigation.screens.login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.components.Buttons

@Composable
fun LoginScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ){
        Text(
            text = "LOGIN",
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp)
        )
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ){
            Button(
                onClick = { navController.navigate("menu") },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Entrar",
                    color = Color.Black

                )

            }
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showLoginScreen() {
   LoginScreen(navController = rememberNavController())
}
