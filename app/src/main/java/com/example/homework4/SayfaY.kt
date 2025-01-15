package com.example.homework4

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SayfaY(navController: NavController) {
    // Geri tuşu ile anasayfaya dönme işlemi
    BackHandler {
        navController.navigate("anasayfa") {
            popUpTo("anasayfa") { inclusive = true }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Sayfa Y") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                navController.navigate("anasayfa") {
                    popUpTo("anasayfa") { inclusive = true }
                }
            }) {
                Text("Geri Anasayfaya Dön")
            }
        }
    }
}
