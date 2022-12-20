package me.teplyakov.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TypographyPreview() {
    val modifier = Modifier.padding(8.dp)
    val typographyTheme = MaterialTheme.typography
    Column {
        Text(
            "Display large",
            modifier = modifier,
            style = typographyTheme.displayLarge,
        )
        Text(
            "Display medium",
            modifier = modifier,
            style = typographyTheme.displayMedium,
        )
        Text(
            "Display small",
            modifier = modifier,
            style = typographyTheme.displaySmall,
        )
        Text(
            "Headline large",
            modifier = modifier,
            style = typographyTheme.headlineLarge,
        )
        Text(
            "Headline medium",
            modifier = modifier,
            style = typographyTheme.headlineMedium,
        )
        Text(
            "Headline small",
            modifier = modifier,
            style = typographyTheme.headlineSmall,
        )
        Text(
            "Title large",
            modifier = modifier,
            style = typographyTheme.titleLarge,
        )
        Text(
            "Title medium",
            modifier = modifier,
            style = typographyTheme.titleMedium,
        )
        Text(
            "Title small",
            modifier = modifier,
            style = typographyTheme.titleSmall,
        )
        Text(
            "Body large",
            modifier = modifier,
            style = typographyTheme.bodyLarge,
        )
        Text(
            "Body medium",
            modifier = modifier,
            style = typographyTheme.bodyMedium,
        )
        Text(
            "Body small",
            modifier = modifier,
            style = MaterialTheme.typography.bodySmall,
        )
        Text(
            "Label large",
            modifier = modifier,
            style = typographyTheme.labelLarge,
        )
        Text(
            "Label medium",
            modifier = modifier,
            style = typographyTheme.labelMedium,
        )
        Text(
            "Label small",
            modifier = modifier,
            style = typographyTheme.labelSmall,
        )
    }
}
