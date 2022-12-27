
[![Maven Central](https://img.shields.io/maven-central/v/me.teplyakov/compose-theme-preview.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22me.teplyakov%22%20AND%20a:%22compose-theme-preview%22)

This library provides ability tot preview your compose theme in few lines of code.

### Usage

Using Gradle Groovy DSL

```
implementation 'me.teplyakov:compose-theme-preview:<last version>'
```

Using Gradle Kotlin DSL

```
implementation("me.teplyakov:compose-theme-preview:<last version>")
```


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
fun ColorsThemePreview() {
    YourTheme {
        ColorsPreview()
    }
}
```

#### Typography preview

```
@Preview
@Composable
fun TypographyThemePreview() {
    YourTheme {
        TypographyPreview()
    }
}
```

#### Shapes preview

```
@Preview
@Composable
fun ShapesThemePreview() {
    YourTheme {
        ShapesPreview()
    }
}
```

### Compatibility

| Library Version | Compose bom version |
|-----------------|---------------------|
| 0.1.x           | 2022.12.00          |
