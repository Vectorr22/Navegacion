@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigate.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    id: Int,
    opcional: String,
    navController: NavController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(
                    text = "List Screen",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            },
                navigationIcon = {
                    IconButton(onClick = {navController.popBackStack()}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF009688)
                )
            )
        },
        containerColor = Color(0xFFDEE2E2)
    ) { innerPadding ->
        ContentDetailView(
            modifier = Modifier.padding(innerPadding),
            id = id,
            opcional = opcional,
            onHomeButtonClicked = {navController.navigate("Home")}
        )
    }
}

@Composable
private fun ContentDetailView(
    modifier: Modifier = Modifier,
    id: Int,
    opcional: String,
    onHomeButtonClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Esta es la vista 3",
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "El valor de id es: $id",
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = "El valor de opcional es: ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = opcional,
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(90.dp))
        Button(
            onClick = onHomeButtonClicked,
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            )
        ) {
            Text(text = "Volver a home")
        }


    }
}
//
//@Preview
//@Composable
//private fun ListScreenPreview() {
//    ListScreen(
//        id = 2,
//        opcional = ""
//    )
//}