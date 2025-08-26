package com.example.androidsteam

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidsteam.ui.theme.AndroidSteamTheme

class TelaInicial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSteamTheme {
                Tela3()
            }
        }
    }
}

@Preview
@Composable
fun Tela3(){
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ) {
            Cabecalho()
            Bloco1()
            Bloco2()
            Bloco3()
            Footer()
        }
    }
}

@Composable
private fun Bloco3() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Red)
    ) {

    }
}

@Composable
private fun Bloco2() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Blue)
    ) {

    }
}

@Composable
private fun Bloco1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.LightGray)
    ) {

    }
}

@Composable
private fun Footer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Cyan)
    ) {

    }
}

@Composable
private fun Cabecalho() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Yellow)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row {
                TextField(
                    value = "Busca",
                    label = {
                        Text("STEAM")
                    },
                    modifier = Modifier.height(20.dp).fillMaxWidth(0.85f),
                    onValueChange = {}
                )
                Spacer(Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = ""
                )
                Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = ""
                )
            }

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()
            ) {
                Text("MENU")
                Text("LISTA DESEJOS")
                Text("CARTEIRA (R$ 0,00)")
            }
        }
    }
}