package com.akshay.whatsapp.presentation.community_screen

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
fun CommunityScreen() {

    val communitySampleData = listOf(
        CommunityData(R.drawable.community_sample_image, "Jahil Community", "1 lakh members"),
        CommunityData(R.drawable.community_sample_image, "Jahil log", "512 members")
    )

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigation() },
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
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
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
                Text(text = "Start a new Community", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Your Communities",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            LazyColumn {
                items(communitySampleData) {
                    CommunityItemDesign(communityData = it)
                }
            }
        }
    }
}