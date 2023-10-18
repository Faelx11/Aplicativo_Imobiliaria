package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.twotone.AccountBox
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.Create
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.components.RedButton
import com.example.appimobiliaria.ui.theme.DarkGray
import com.example.appimobiliaria.ui.theme.Gray

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Red
                ),
                navigationIcon = {

                }
            )
        }
    ){
        ContenHomeScreen(navController)
    }
}

@Composable
fun ContenHomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(top = 80.dp),
        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //COMPRAR
        RedButton(text = "Comprar", icon = Icons.TwoTone.ShoppingCart){
            navController.navigate("comprar")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //ALUGAR
        RedButton(text = "Alugar", icon = Icons.TwoTone.Home){
            navController.navigate("comprar")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //NOVOS
        RedButton(text = "Novos", icon = Icons.TwoTone.Add){
            navController.navigate("novo")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //ANUNCIE NO APP
        RedButton(text = "Anuncie no App", icon = Icons.TwoTone.Create){
            navController.navigate("Anuncie")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //NOSSO TIME
        RedButton(text = "Nosso time", icon = Icons.TwoTone.AccountBox){
            navController.navigate("sobre")
        }

        Spacer(modifier = Modifier.height(28.dp)) // Espaço entre o botões

        //SOBRE NÓS
        RedButton(text = "Sobre nós", icon = Icons.TwoTone.Face){
            navController.navigate("sobre")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}