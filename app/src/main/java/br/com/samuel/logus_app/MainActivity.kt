package br.com.samuel.logus_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.samuel.logus_app.backendservices.sharedprefs.SharedPrefsService
import br.com.samuel.logus_app.ui.screens.ScreenDashboard
import br.com.samuel.logus_app.ui.screens.ScreenLogin
import br.com.samuel.logus_app.ui.screens.ScreenLoginVm
import br.com.samuel.logus_app.ui.theme.LogusappTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var sharedPrefsService: SharedPrefsService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            LogusappTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "dashboard") {
                    composable("dashboard") {
                        ScreenDashboard()
                    }
                    composable("login") {
                        ScreenLogin()
                    }
                    //Add more composable screens
                }
            }
        }
    }
}
