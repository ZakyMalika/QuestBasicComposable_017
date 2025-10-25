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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        val gambar = painterResource(id = R.drawable.user)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
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
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        )

        {
            Text(text = "Ini Box")
        }

    }
}