package com.akshay.whatsapp.presentation.update_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
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
fun UpdateScreen() {

    val scrollState = rememberScrollState()
    val sampleStatusData = listOf(
        StatusData(R.drawable.sample_user_image, "Akshay Sharma", "Just Now"),
        StatusData(R.drawable.sample_user_image, "Akshay The Great", "5 min ago"),
        StatusData(R.drawable.sample_user_image, "Akshay Op", "20 hours ago"),
    )
    val sampleChannelsData = listOf(
        ChannelData(R.drawable.meta_icon, "Aaj Tak", "Get's today's news"),
        ChannelData(R.drawable.meta_icon, "Meta", "Get news about meta")
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.camera_icon),
                    contentDescription = null,
                    Modifier.size(50.dp)
                )
            }
        },

        bottomBar = {
            BottomNavigation()
        },

        topBar = {
            TopBar()
        }
    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            MyStatus()

            sampleStatusData.forEach {
                StatusItem(statusData = it)
            }

            Spacer(modifier = Modifier.height(16.dp))

            HorizontalDivider(color = Color.Gray)

            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = "stay updated on topics that matters to you. Find channels to follow below")

                Spacer(modifier = Modifier.height(32.dp))

                Text(text = "Find channels to follow")
            }

            Spacer(modifier = Modifier.height(16.dp))

            sampleChannelsData.forEach {
                ChannelItemDesign(channelData = it)
            }
        }

    }
}