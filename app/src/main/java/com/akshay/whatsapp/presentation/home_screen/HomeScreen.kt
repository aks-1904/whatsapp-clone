package com.akshay.whatsapp.presentation.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun HomeScreen() {

    val chatData =
        listOf(
            ChatListModel(R.drawable.sample_user_image, "Akshay Sharma", "10:00 AM", "Hello"),
            ChatListModel(R.drawable.sample_user_image, "Akshay The Great", "9:00 AM", "Yoo"),
            ChatListModel(R.drawable.sample_user_image, "Akshay Opp", "8:00 AM", "Yup")
        )

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = colorResource(id = R.color.light_green),
            modifier = Modifier.size(65.dp),
            contentColor = Color.White
        ) {
            Icon(
                painter = painterResource(id = R.drawable.add_chat_icon),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
    }, bottomBar = {
        BottomNavigation()
    }) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Whatsapp",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(
                        id = R.color.light_green
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp)
                )

                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera_icon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.search_icon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.three_dot_icon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

            }
            HorizontalDivider()

            LazyColumn {
                items(chatData) {
                    ChatDesign(chatListModel = it)
                }
            }
        }
    }
}