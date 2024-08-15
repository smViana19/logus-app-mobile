package br.com.samuel.logus_app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun AppLoading() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .zIndex(1f) // Define o zIndex para sobrepor outros elementos
            .background(Color.Black.copy(alpha = 0.7f)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(modifier = Modifier.size(48.dp), color = Color(0xFF820AD1) )
        Text(
            text = "Carregando...",
            color = Color.White

        )
    }
}


@Preview
@Composable
private fun AppLoadingPreview() {
    AppLoading()
}