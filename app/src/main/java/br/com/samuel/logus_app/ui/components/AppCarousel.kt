package br.com.samuel.logus_app.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.samuel.logus_app.R

@Composable
fun AppCarousel() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(5) { index ->
            AppCardDefault(
                modifier = Modifier.size(200.dp, 100.dp),
                content = { Text(text = "Teste cards") },
                title = "Card ${index + 1}",
                elevation = 4.dp,
                onClick = {}
            )

        }
    }
}

@Composable
fun AppCarouselRounded() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(5) { index ->
            AppCardRounded(
                icon = painterResource(id = R.drawable.ic_copy_24dp),
                title = "Atividades"

            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppCarouselRoundedPreview() {
    AppCarouselRounded()
}

@Preview(showBackground = true)
@Composable
fun AppCarouselPreview() {
    AppCarousel()
}