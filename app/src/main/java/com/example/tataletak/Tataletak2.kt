package com.example.tataletak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun Tambah(modifier: Modifier){
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxWidth())
    {
        val gambar = painterResource(id = R.drawable.almet)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(size = 100.dp)
                .padding(all = 1.dp)
        )

        Spacer(modifier = modifier.padding())
        Text(text = stringResource(id = R.string.name))
        Spacer(modifier = modifier.padding())
        Box(
            modifier = Modifier
//                .fillMaxWidth()
                .height(height = 100.dp)
                .width(width = 100.dp)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center
        )

        {
            Text(text = "Ini Box 1")
        }
        Spacer(modifier = Modifier.padding(top = 40.dp))
        Row() {
            Box(
                modifier = Modifier
//                .fillMaxWidth()
                    .height(height = 100.dp)
                    .width(width = 100.dp)
                    .background(color = Color.Cyan),
                contentAlignment = Alignment.Center
            )

            {
                Text(text = "Ini Box 2")
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Box(
                modifier = Modifier
//                .fillMaxWidth()
                    .height(height = 100.dp)
                    .width(width = 100.dp)
                    .clip(CircleShape)
                    .background(color = Color.LightGray),
                contentAlignment = Alignment.Center
            )

            {
                Text(text = "Ini Circle 1")
            }
            Spacer(modifier = Modifier.padding(top = 30.dp))


        }
        Spacer(modifier = Modifier.height(height = 40.dp))
        Row() {
            Box(
                modifier = Modifier
//                .fillMaxWidth()
                    .height(height = 100.dp)
                    .width(width = 100.dp)
                    .clip(CircleShape)
                    .background(color = Color.Green),


                contentAlignment = Alignment.Center
            )

            {
                Text(text = "Ini Circle 2")
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Box(
                modifier = Modifier
//                .fillMaxWidth()
                    .height(height = 100.dp)
                    .width(width = 100.dp)
                    .background(color = Color.Yellow),
                contentAlignment = Alignment.Center
            )

            {
                Text(text = "Ini Box 3")
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Box(
                modifier = Modifier
//                .fillMaxWidth()
                    .height(height = 100.dp)
                    .width(width = 100.dp)
                    .clip(CircleShape)
                    .background(color = Color.Cyan),
                contentAlignment = Alignment.Center
            )

            {
                Text(text = "Ini Circle 3")
            }
        }
    }
}