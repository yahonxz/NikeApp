package com.example.nikeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nikeapp.ui.theme.NikeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (modifier = Modifier.background(Color.LightGray)){
                Column (modifier = Modifier.background(Color.White)){
                    SimpleSwitchWithLogos()
                    Titulo()
                }
                Spacer(modifier = Modifier.height(2.dp))
                Column (modifier = Modifier.background(Color.White)
                    .padding(top = 15.dp)){
                    Colecciones()
                }
            }

        }
    }
}


@Composable
fun SimpleSwitchWithLogos() {
    Row(
        modifier = Modifier
            .padding(16.dp,14.dp)
            .statusBarsPadding()
            .fillMaxWidth()
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

@Composable
fun Titulo (){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 6.dp, end = 16.dp)
    ) {
        Text(
            text = "Comprar",
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(18.dp),
            modifier = Modifier.padding(top = 22.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Hombre",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(bottom = 12.dp))
                // Línea debajo de "Hombre"
                Box(
                    modifier = Modifier
                        .width(60.dp) // Ajustamos el ancho de la línea al texto
                        .height(1.dp)
                        .background(Color.Black)
                )
            }

            Text(text = "Mujer")
            Text(text = "Niño/a")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Colecciones (){
    Column (modifier = Modifier.padding(16.dp, 11.dp)
            .fillMaxWidth()){
        Text(text = "Comprar por colección Hombre",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 12.dp))
        Row (horizontalArrangement = Arrangement.spacedBy(7.dp),
            modifier = Modifier.
            horizontalScroll(rememberScrollState())
            .fillMaxWidth()){
            Column {
                Image(painter = painterResource(R.drawable.descuento),
                    contentDescription = "Imagen descuento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(140.dp)
                        .height(130.dp))
                Text(text = "¡Solo por 72 horas!",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 4.dp, top = 8.dp))
            }
            Column {
                Image(painter = painterResource(R.drawable.correr),
                    contentDescription = "Imagen descuento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(140.dp)
                        .height(130.dp))
                Text(text = "Lanzamientos para correr",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 11.sp,
                    modifier = Modifier.padding(start = 4.dp, top = 8.dp))
            }
            Column {
                Image(painter = painterResource(R.drawable.recompensas),
                    contentDescription = "Imagen descuento",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(140.dp)
                        .height(130.dp))
                Text(text = "Consulta recompensas",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 4.dp, top = 8.dp))
            }
        }
    }
}