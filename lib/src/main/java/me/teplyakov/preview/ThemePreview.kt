package me.teplyakov.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ThemePreview() {
    val titleStyle = MaterialTheme.typography.titleMedium
    Column(
        modifier = Modifier.fillMaxHeight(),
    ) {
        Text(
            "Colors",
            style = titleStyle,
        )
        ColorsPreview()
        Text(
            "Typography",
            style = titleStyle,
        )
        TypographyPreview()
        Text(
            "Shapes",
            style = titleStyle,
        )
        ShapesPreview()
    }
}
