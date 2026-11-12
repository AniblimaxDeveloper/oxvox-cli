package com.oxvox.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oxvox.app.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("COMMAND CENTER", color = NeonCyan, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = VillainBlack)
            )
        },
        containerColor = VillainBlack
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            // Status Card
            Card(
                colors = CardDefaults.cardColors(containerColor = VillainDarkGray),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("SYSTEM STATUS", color = TextGray, fontSize = 12.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("ONLINE & SECURE", color = Color.Green, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Backend: Not Connected (Phase 3)", color = TextGray, fontSize = 12.sp)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text("QUICK ACTIONS", color = TextWhite, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(12.dp))

            // Grid Actions
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                ActionCard("Device\nCenter", ComicPurple, Modifier.weight(1f))
                Spacer(modifier = Modifier.width(12.dp))
                ActionCard("Remote\nAssist", BloodRed, Modifier.weight(1f))
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                ActionCard("Parental\nControl", NeonCyan, Modifier.weight(1f))
                Spacer(modifier = Modifier.width(12.dp))
                ActionCard("Security\nCenter", VillainDarkGray, Modifier.weight(1f))
            }
        }
    }
}

@Composable
fun ActionCard(title: String, accentColor: Color, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(100.dp),
        colors = CardDefaults.cardColors(containerColor = VillainDarkGray),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            // Garis aksen gaya komik
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(4.dp)
                    .background(accentColor)
                    .align(Alignment.CenterStart)
            )
            Text(
                text = title,
                color = TextWhite,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    }
}
