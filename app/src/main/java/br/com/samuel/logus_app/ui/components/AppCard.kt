package br.com.samuel.logus_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.samuel.logus_app.R

@Composable
fun AppCardDefault(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: @Composable () -> Unit,
    backgroundColor: Color = Color(0xFFF0F1F5),
    elevation: Dp = 2.dp,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            if (title != null) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
            }
            content()
        }

    }
}

@Composable
fun AppCardRounded(
    modifier: Modifier = Modifier,
    icon: Painter,
    iconTint: Color = Color(0xFF6E48A3),
    backgroundColor: Color = Color(0xFFF0F1F5),
    title: String = "",
    titleColor: Color = Color(0xFF484848)
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            modifier = modifier
                .size(70.dp)
                .clip(CircleShape),
            colors = CardDefaults.cardColors(containerColor = backgroundColor),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Icon(
                modifier = modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                painter = icon,
                contentDescription = "",
                tint = iconTint,
            )
        }
        Row(modifier = modifier.padding(top = 8.dp)) {
            Text(text = title, color = titleColor)
        }
    }

}

@Preview
@Composable
private fun AppCardDefaultPreview() {
    AppCardDefault(content = {
        Text(text = "Design de card")
        Text(text = "Design de card")
        Text(text = "Design de card")
    })
}

@Preview
@Composable
private fun AppCardRoundedPreview() {
    AppCardRounded(icon = painterResource(id = R.drawable.ic_copy_24dp), title = "Atividades")
}
