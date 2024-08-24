package br.com.samuel.logus_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AppCardDefault(
    modifier: Modifier = Modifier,
    title: String? = null,
    content: @Composable () -> Unit,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
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

@Preview
@Composable
private fun AppCardDefaultPreview() {
    AppCardDefault(content = {
        Text(text = "Design de card")
        Text(text = "Design de card")
        Text(text = "Design de card")

    })
    
}