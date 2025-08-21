package com.example.androidsteam

import android.annotation.SuppressLint
import android.graphics.Paint.Style
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidsteam.ui.theme.AndroidSteamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSteamTheme {
                TelaPerfil()
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun TelaPerfil(){
    Scaffold {
        Surface {
            Column(
                modifier = Modifier.background(Color.DarkGray)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(10.dp).
                    fillMaxWidth()
                ) {
                    Icon(imageVector = Icons.Default.AccountBox,
                    contentDescription = "",
                    modifier = Modifier.size(100.dp))

                    Column {
                        Text("Nome", style = MaterialTheme.typography.headlineLarge)
                        Text("Estado, País")
                    }
                }

                Row(modifier = Modifier.fillMaxWidth().
                    padding(15.dp, 5.dp).
                    background(color = Color.LightGray),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("editar perfil")
                }

                Row(modifier = Modifier.fillMaxWidth().
                padding(15.dp, 5.dp).
                    height(70.dp).
                background(color = Color.LightGray),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text("Nível X", style = MaterialTheme.typography.headlineLarge) }
                    Spacer(modifier = Modifier.padding(30.dp))
                    Column {
                        Text("X anos de serviço")
                    }

                }

                Row(modifier = Modifier.fillMaxWidth().
                padding(15.dp, 5.dp).
                height(50.dp).
                background(color = Color.LightGray),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text("On-line", color = Color.Green )
                }

                Row {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(modifier = Modifier.fillMaxWidth().
                        padding(15.dp, 5.dp, 5.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Grupos: X" )
                        }

                        Row(modifier = Modifier.fillMaxWidth().
                        padding(15.dp, 5.dp, 5.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Jogos: X")
                        }

                        Row(modifier = Modifier.fillMaxWidth().
                        padding(15.dp, 5.dp, 5.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Capturas de Tela: X")
                        }
                    }
                    Spacer(modifier = Modifier.padding())

                    Column(modifier = Modifier.weight(1f)) {
                        Row(modifier = Modifier.fillMaxWidth().
                        padding(5.dp, 5.dp, 15.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Amigos: X")
                        }

                        Row(modifier = Modifier.fillMaxWidth().
                        padding(5.dp, 5.dp, 15.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Inventário")
                        }

                        Row(modifier = Modifier.fillMaxWidth().
                        padding(5.dp, 5.dp, 15.dp).
                        height(50.dp).
                        background(color = Color.LightGray),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Análise")
                        }
                    }
                }


            }
        }
    }


}

/*
@Composable
fun TelaLogin(){
    var usuario by remember {
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }
    Scaffold {
        Surface {
            Column(
                modifier = Modifier
                    .background(color = Color(AndroidColor.parseColor("#292c33")))
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 20.dp)
                ) {
                    Text("INICIAR SESSÃO", color = Color.White, style = MaterialTheme.typography.titleLarge)
                }
                Row(modifier = Modifier.height(30.dp)) {
                    Text("NOME DE USUÁRIO STEAM", color = Color.LightGray)
                }
                Row(modifier = Modifier.height(80.dp)) {
                    TextField(
                        value = usuario,
                        onValueChange = {usuario = it},
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(AndroidColor.parseColor("#202126")),
                            unfocusedContainerColor = Color(AndroidColor.parseColor("#202126")),
                            disabledContainerColor = Color(AndroidColor.parseColor("#202126"))
                        )
                    )
                }
                Row(modifier = Modifier.height(30.dp)) {
                    Text("SENHA", color = Color.LightGray)
                }
                Row(modifier = Modifier.height(80.dp)) {
                    TextField(
                        value = senha,
                        onValueChange = {senha = it},
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(AndroidColor.parseColor("#202126")),
                            unfocusedContainerColor = Color(AndroidColor.parseColor("#202126")),
                            disabledContainerColor = Color(AndroidColor.parseColor("#202126"))
                        )
                    )
                }
                Row(modifier = Modifier.height(70.dp)) {
                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RectangleShape,
                        colors = ButtonColors(
                            containerColor = Color(AndroidColor.parseColor("#216cad")),
                            contentColor = Color.White,
                            disabledContainerColor = Color.White,
                            disabledContentColor = Color.White
                        ),

                        ) {
                        Text("Iniciar sessão")
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth().height(30.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("Preciso de ajuda para iniciar a sessão", color = Color.LightGray)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("Não tem uma conta Steam?", color = Color.White)
                }
            }
        }
    }
}


 */