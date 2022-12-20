package me.teplyakov.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShapesPreview() {
    val modifier = Modifier.padding(8.dp)
    val shapesTheme = MaterialTheme.shapes
    Column {
        Surface(
            shape = shapesTheme.extraLarge,
            modifier = modifier,
        ) {
            Text(
                "Extra large",
                modifier = modifier,
            )
        }
        Surface(
            shape = shapesTheme.large,
            modifier = modifier,
        ) {
            Text(
                "Large",
                modifier = modifier,
            )
        }
        Surface(
            shape = shapesTheme.medium,
            modifier = modifier,
        ) {
            Text(
                "Medium",
                modifier = modifier,
            )
        }
        Surface(
            shape = shapesTheme.small,
            modifier = modifier,
        ) {
            Text(
                "Small",
                modifier = modifier,
            )
        }
        Surface(
            shape = shapesTheme.extraSmall,
            modifier = modifier,
        ) {
            Text(
                "Extra small",
                modifier = modifier,
            )
        }
    }
}
