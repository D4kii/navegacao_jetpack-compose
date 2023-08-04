package br.senai.sp.jandira.navigation.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Buttons(title: String) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color.White)
    ) {
        Text(
            text = title,
            color = Color.Black

        )

    }
}
@Preview
@Composable
fun ButtonPreview() {
    Buttons(title = "teste")
}