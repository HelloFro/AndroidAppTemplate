package dev.hellofro.app.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun App(
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Hello Fro",
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
fun AppPreview() {
    MaterialTheme {
        App(
            modifier = Modifier
                .background(
                    color = MaterialTheme.colorScheme.background
                )
        )
    }
}