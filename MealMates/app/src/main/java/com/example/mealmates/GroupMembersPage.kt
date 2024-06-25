package com.example.mealmates

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GroupMembersPage(){
    val numMembers = 5
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height((LocalConfiguration.current.screenHeightDp * 0.50).dp)
            .background(Color.White)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // List of people in group, hardcoded for now
        for (i in 1..numMembers) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(color = Color.White)
                    .padding(20.dp),
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ){
                /*AsyncImage(
                    model = "https://avatars.discourse-cdn.com/v4/letter/${i}/e9a140/96.png",
                    contentDescription = "$i"
                )*/
                Button(
                    onClick = { /* todo */ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray, Color.LightGray, Color.Black, Color.White),
                    modifier = Modifier
                        .height(80.dp)
                        .width((LocalConfiguration.current.screenWidthDp * 0.80).dp),
                    shape = RectangleShape
                ) {
                    Text("Group Member $i", color = Color.Black, fontSize = 24.sp)
                }
            }
        }
    }
}
