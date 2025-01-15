package com.yourpackage.name

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Anasayfa(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Anasayfa") })
        }
    ) {
        // Padding ve ortalamak için Column kullanımı
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("sayfaA") }) {
                Text("Git > A")
            }
            Spacer(modifier = Modifier.height(8.dp)) // Butonlar arasında boşluk
            Button(onClick = { navController.navigate("sayfaX") }) {
                Text("Git > X")
            }
        }
    }
}
