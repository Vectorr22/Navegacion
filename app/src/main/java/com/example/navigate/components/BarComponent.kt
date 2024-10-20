package com.example.navigate.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(
    modifier: Modifier = Modifier,
    name: String
) {
    Text(
        text = name,
        fontSize = 20.sp,
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
) {
    FloatingActionButton(
        onClick = {},
        containerColor = Color.Red,
        contentColor = Color.White,
        modifier = modifier
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
    }
}

@Composable
fun MainIconButton(icon: ImageVector, onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(imageVector = icon, contentDescription = null, tint = Color.White)
    }
}