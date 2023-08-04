package br.senai.sp.jandira.navigation.screens.menu.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.senai.sp.jandira.navigation.components.Buttons

@Composable
fun MenuScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ){
        Text(text = "LOGIN")
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ){
            Button(
                onClick = { navController.navigate("perfil") },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    text = "Perfil",
                    color = Color.Black

                )

            }
        }
        Button(
            onClick = { navController.navigate("pedido") },
            colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Text(
                text = "Pedidos",
                color = Color.Black

            )

        }
    }
    Button(
        onClick = { navController.navigate("login") },
        colors = ButtonDefaults.buttonColors(Color.White)
    ) {
        Text(
            text = "Sair",
            color = Color.Black

        )

    }
}
        }

    }
}

