package br.senai.sp.jandira.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.screens.login.screen.LoginScreen
import br.senai.sp.jandira.navigation.screens.menu.screen.MenuScreen
import br.senai.sp.jandira.navigation.screens.pedidos.screen.PedidosScreen
import br.senai.sp.jandira.navigation.screens.perfil.screen.PerfilScreen
import br.senai.sp.jandira.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ){
                        composable(route = "login"){
                            LoginScreen(navController)
                        }
                        composable(route = "menu"){
                            MenuScreen(navController)
                        }
                        composable(route = "perfil"){
                            PerfilScreen(navController)
                        }
                        composable(route = "pedido"){
                            PedidosScreen(navController)
                        }
                    }
                }
            }
        }
    }
}

