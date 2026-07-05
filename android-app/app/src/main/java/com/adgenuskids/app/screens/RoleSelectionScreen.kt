package com.adgenuskids.app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RoleSelectionScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF1565C0),
                        Color(0xFF42A5F5)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Welcome",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Choose Your Role",
                fontSize = 20.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            RoleCard("👧 Child")
            RoleCard("👨 Parent")
            RoleCard("👩‍🏫 Teacher")
            RoleCard("🏫 School")

        }

    }

}

@Composable
fun RoleCard(title:String){

    Card(

        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
            .clickable { },

        elevation = CardDefaults.cardElevation(8.dp),

        shape = RoundedCornerShape(20.dp)

    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),

            contentAlignment = Alignment.Center

        ) {

            Text(
                text = title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

        }

    }

}