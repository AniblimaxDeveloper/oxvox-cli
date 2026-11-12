package com.oxvox.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.oxvox.app.R
import com.oxvox.app.navigation.Screen
import com.oxvox.app.ui.theme.NeonCyan
import com.oxvox.app.ui.theme.VillainBlack
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate(Screen.Dashboard.route) {
            popUpTo(Screen.Splash.route) { inclusive = true }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(VillainBlack),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // Jika Anda memindahkan gambar, ganti R.drawable.logo dengan ID resource gambar Anda
            // Image(painter = painterResource(id = R.drawable.logo), contentDescription = "OXVOX Logo", modifier = Modifier.size(150.dp))
            
            Text(
                text = "OXVOX",
                color = NeonCyan,
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 8.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "SECURE. MANAGE. COMMAND.",
                color = Color.Gray,
                fontSize = 14.sp,
                letterSpacing = 2.sp
            )
        }
    }
}
