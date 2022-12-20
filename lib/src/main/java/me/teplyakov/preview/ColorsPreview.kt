package me.teplyakov.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColorsPreview() {
    val squareModifier = Modifier.size(80.dp)
    val textModifier = Modifier.padding(8.dp)
    val textStyle = MaterialTheme.typography.bodySmall
    val colorScheme = MaterialTheme.colorScheme
    val rowModifier = Modifier.padding(vertical = 4.dp)
    Column {
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.primary,
            ) {
                Text(
                    "Primary",
                    modifier = textModifier,
                    color = colorScheme.onPrimary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onPrimary,
            ) {
                Text(
                    "On primary",
                    modifier = textModifier,
                    color = colorScheme.primary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.primaryContainer,
            ) {
                Text(
                    "Primary container",
                    modifier = textModifier,
                    color = colorScheme.onPrimaryContainer,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onPrimaryContainer,
            ) {
                Text(
                    "On primary container",
                    modifier = textModifier,
                    color = colorScheme.primaryContainer,
                    style = textStyle,
                )
            }
        }
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.secondary,
            ) {
                Text(
                    "Secondary",
                    modifier = textModifier,
                    color = colorScheme.onSecondary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onSecondary,
            ) {
                Text(
                    "On secondary",
                    modifier = textModifier,
                    color = colorScheme.secondary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.secondaryContainer,
            ) {
                Text(
                    "Secondary container",
                    modifier = textModifier,
                    color = colorScheme.onSecondaryContainer,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onSecondaryContainer,
            ) {
                Text(
                    "On secondary container",
                    modifier = textModifier,
                    color = colorScheme.secondaryContainer,
                    style = textStyle,
                )
            }
        }
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.tertiary,
            ) {
                Text(
                    "Tertiary",
                    modifier = textModifier,
                    color = colorScheme.onTertiary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onTertiary,
            ) {
                Text(
                    "On tertiary",
                    modifier = textModifier,
                    color = colorScheme.tertiary,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.tertiaryContainer,
            ) {
                Text(
                    "Tertiary container",
                    modifier = textModifier,
                    color = colorScheme.onSecondaryContainer,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onTertiaryContainer,
            ) {
                Text(
                    "On tertiary container",
                    modifier = textModifier,
                    color = colorScheme.tertiaryContainer,
                    style = textStyle,
                )
            }
        }
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.background,
            ) {
                Text(
                    "Background",
                    modifier = textModifier,
                    color = colorScheme.onBackground,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onBackground,
            ) {
                Text(
                    "On background",
                    modifier = textModifier,
                    color = colorScheme.background,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.surface,
            ) {
                Text(
                    "Surface",
                    modifier = textModifier,
                    color = colorScheme.onSurface,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onSurface,
            ) {
                Text(
                    "On surface",
                    modifier = textModifier,
                    color = colorScheme.surface,
                    style = textStyle,
                )
            }
        }
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.surfaceVariant,
            ) {
                Text(
                    "Surface variant",
                    modifier = textModifier,
                    color = colorScheme.onSurfaceVariant,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onSurfaceVariant,
            ) {
                Text(
                    "On surface variant",
                    modifier = textModifier,
                    color = colorScheme.surfaceVariant,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.outline,
            ) {
                Text(
                    "Outline",
                    modifier = textModifier,
                    color = colorScheme.outlineVariant,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.outlineVariant,
            ) {
                Text(
                    "Outline variant",
                    modifier = textModifier,
                    color = colorScheme.outline,
                    style = textStyle,
                )
            }
        }
        //
        Row(
            modifier = rowModifier,
        ) {
            Surface(
                modifier = squareModifier,
                color = colorScheme.error,
            ) {
                Text(
                    "Error",
                    modifier = textModifier,
                    color = colorScheme.onError,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onError,
            ) {
                Text(
                    "On error",
                    modifier = textModifier,
                    color = colorScheme.error,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.errorContainer,
            ) {
                Text(
                    "Error container",
                    modifier = textModifier,
                    color = colorScheme.onErrorContainer,
                    style = textStyle,
                )
            }
            Surface(
                modifier = squareModifier,
                color = colorScheme.onErrorContainer,
            ) {
                Text(
                    "On error container",
                    modifier = textModifier,
                    color = colorScheme.errorContainer,
                    style = textStyle,
                )
            }
        }
    }
}
