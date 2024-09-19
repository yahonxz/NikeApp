package com.example.nikeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nikeapp.ui.theme.NikeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleSwitchWithLogos()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SimpleSwitchWithLogos() {
    Row(
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth(  )
    ) {
        // Logotipo de Nike
        val nikeLogo: Painter = painterResource(id = R.drawable.nike_logo)
        Image(
            painter = nikeLogo,
            contentDescription = "Nike logo",
            modifier = Modifier.size(40.dp),
            contentScale = ContentScale.Crop
        )

        // Espacio entre el logo y el switch
        Spacer(modifier = Modifier.width(16.dp))

        Icon(Icons.Sharp.Search,
            contentDescription = "icono de buscar",
            modifier = Modifier.padding(start = 250.dp, bottom = 15.dp))
    }
}