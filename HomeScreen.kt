
package com.example.autoecole

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Bienvenue à l'accueil")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* TODO: Naviguer vers d'autres sections */ }) {
                Text("Voir les cours")
            }
        }
    }
}
