package br.com.samuel.logus_app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.samuel.logus_app.ui.components.AppCarousel
import br.com.samuel.logus_app.ui.components.AppCarouselRounded

@Composable
fun ScreenDashboard(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF820AD1)),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .weight(.2f),
        ) {
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
        ) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .fillMaxSize()
                    .background(White)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Olá, user",
                        fontSize = 24.sp,
                    )
                }
                Column(modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(top = 64.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        AppCarousel()
                    }
                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp)
                    ) {
                        AppCarouselRounded()
                    }
                }

            }

        }


    }
}



@Preview(showBackground = true)
@Composable
fun ScreenDashboardPreview() {
    ScreenDashboard()
}