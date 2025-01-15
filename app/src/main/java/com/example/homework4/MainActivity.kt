package com.example.homework4

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
import com.example.homework4.ui.theme.Homework4Theme

import androidx.compose.material.*
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import com.example.name.SayfaA
import com.yourpackage.name.Anasayfa


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    // NavController oluşturuyoruz
    val navController = rememberNavController()

    // NavHost, sayfalar arasında geçişleri yönetecek yapı
    NavHost(navController, startDestination = "anasayfa") {
        composable("anasayfa") { Anasayfa(navController) }
        composable("sayfaA") { SayfaA(navController) }
        composable("sayfaB") { SayfaB(navController) }
        composable("sayfaX") { SayfaX(navController) }
        composable("sayfaY") { SayfaY(navController) }
    }
}

