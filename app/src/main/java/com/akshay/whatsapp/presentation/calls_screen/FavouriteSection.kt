package com.akshay.whatsapp.presentation.calls_screen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akshay.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun FavouriteSection() {

    val sampleFavouriteContact = listOf(
        FavouriteContact(R.drawable.sample_user_image, "Akshay Sharma"),
        FavouriteContact(R.drawable.sample_user_image, "Akshay Oppp"),
        FavouriteContact(R.drawable.sample_user_image, "Akshay is great")
    )

    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
        Text(
            text = "Favourites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            sampleFavouriteContact.forEach { FavouriteItem(it) }
        }
    }
}

data class FavouriteContact(val image: Int, val name: String)