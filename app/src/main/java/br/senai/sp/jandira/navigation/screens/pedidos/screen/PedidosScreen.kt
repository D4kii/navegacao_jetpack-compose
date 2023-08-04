package br.senai.sp.jandira.navigation.screens.pedidos.screen

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun PedidosScreen(navController: NavController) {
    Button(
        onClick = { navController.navigate("menu") },
        colors = ButtonDefaults.buttonColors(Color.White)
    ) {
        Text(
            text = "Voltar",
            color = Color.Black

        )

    }
}