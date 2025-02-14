package com.rudraksha.bowbow.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


// Light Color Scheme for the Dog App
val LightColorScheme = lightColorScheme(
    primary = DogBrown, // Main color for buttons, etc.
    onPrimary = Color.White, // Text color on top of primary
    primaryContainer = DogLightBrown, // Lighter shade for containers
    onPrimaryContainer = Color.Black, // Text color on top of primaryContainer
    secondary = DogGreen, // Secondary color for accents
    onSecondary = Color.Black, // Text color on top of secondary
    secondaryContainer = DogLightBrown,
    onSecondaryContainer = Color.Black,
    tertiary = DogBlue, // Another accent color
    onTertiary = Color.Black, // Text color on top of tertiary
    tertiaryContainer = DogCream,
    onTertiaryContainer = Color.Black,
    background = DogCream, // Main background color
    onBackground = Color.Black, // Text color on top of background
    surface = DogCream, // Color for cards, dialogs, etc.
    onSurface = Color.Black, // Text color on top of surface
    surfaceVariant = DogLightBrown,
    onSurfaceVariant = Color.Black,
    outline = DogBrown,
    outlineVariant = DogLightBrown,
    scrim = Color.Black.copy(alpha = 0.5f)
)

// Dark Color Scheme for the Dog App
val DarkColorScheme = darkColorScheme(
    primary = DogLightBrown, // Main color for buttons, etc.
    onPrimary = Color.Black, // Text color on top of primary
    primaryContainer = DogBrown, // Darker shade for containers
    onPrimaryContainer = Color.White, // Text color on top of primaryContainer
    secondary = DogGreen, // Secondary color for accents
    onSecondary = Color.Black, // Text color on top of secondary
    secondaryContainer = DogBrown,
    onSecondaryContainer = Color.White,
    tertiary = DogBlue, // Another accent color
    onTertiary = Color.Black, // Text color on top of tertiary
    tertiaryContainer = DogBrown,
    onTertiaryContainer = Color.White,
    background = Color.Black, // Dark background
    onBackground = DogCream, // Text color on top of background
    surface = Color.DarkGray, // Darker color for cards, dialogs, etc.
    onSurface = DogCream, // Text color on top of surface
    surfaceVariant = DogBrown,
    onSurfaceVariant = Color.White,
    outline = DogLightBrown,
    outlineVariant = DogBrown,
    scrim = Color.Black.copy(alpha = 0.5f)
)

@Composable
fun BowBowTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}