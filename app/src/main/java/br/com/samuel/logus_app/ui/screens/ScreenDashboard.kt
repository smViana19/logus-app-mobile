package br.com.samuel.logus_app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.com.samuel.logus_app.R
import br.com.samuel.logus_app.ui.components.AppCardDefault

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
                Spacer(modifier = modifier.height(16.dp))
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    AppCardDefault(
                        modifier = modifier
                            .padding(32.dp),
                        content = {
                            Row(
                                modifier = modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                Text(text = "A escola não fez nenhuma postagem")
                            }

                        })
                    Row(
                        modifier = modifier
                            .background(Color(0xFF820AD1))
                            .fillMaxWidth()

                    ) {
                        Text(text = "wtwadawd")
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