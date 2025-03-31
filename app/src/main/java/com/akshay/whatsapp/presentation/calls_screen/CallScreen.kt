package com.akshay.whatsapp.presentation.calls_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akshay.whatsapp.R
import com.akshay.whatsapp.presentation.bottom_navigation.BottomNavigation

@Composable
@Preview(showSystemUi = true)
fun CallScreen() {

    val sampleCallData = listOf(
        CallData(R.drawable.sample_user_image, "Akshay", "Yesterday, 10:00 AM", false),
        CallData(R.drawable.sample_user_image, "Akshay Sharma", "Yesterday, 7:30 PM", true),
        CallData(R.drawable.sample_user_image, "Akshay The Great", "23rd March, 8:00 AM", true),
        CallData(R.drawable.sample_user_image, "Akshay", "22nd March, 10:30 AM", false)
    )

    Scaffold(
        topBar = { TopBar() }, bottomBar = { BottomNavigation() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_add_ic_call_24),
                    contentDescription = null,
                    Modifier.size(30.dp)
                )
            }
        },
    ) {
        Column(modifier = Modifier.padding((it))) {
            Spacer(modifier = Modifier.height(16.dp))
            FavouriteSection()

            Button(
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        id = R.color.light_green
                    )
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Start a new Call",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Recent Calls",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            LazyColumn {
                items(sampleCallData) { data ->
                    CallItemDesign(call = data)
                }
            }
        }
    }
}