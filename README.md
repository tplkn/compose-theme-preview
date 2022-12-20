This library provides ability tot preview your compose theme in few lines of code.

### Usage

TODO

### Widgets

#### Full theme preview

```
@Preview(heightDp = 1600)
@Composable
fun FullThemePreview() {
    YourTheme {
        ThemePreview()
    }
}
```

**Important**: use _heightDp_ for _@Preview_ annotation to adjust preview widget in IDE

#### Colors preview

```
@Preview
@Composable
fun FullThemePreview() {
    YourTheme {
        ColorsPreview()
    }
}
```

#### Typography preview

```
@Preview
@Composable
fun FullThemePreview() {
    YourTheme {
        TypographyPreview()
    }
}
```

#### Shapes preview

```
@Preview
@Composable
fun FullThemePreview() {
    YourTheme {
        ShapesPreview()
    }
}
```