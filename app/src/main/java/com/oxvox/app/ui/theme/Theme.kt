package com.oxvox.app.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val VillainColorScheme = darkColorScheme(
    primary = ComicPurple,
    onPrimary = TextWhite,
    secondary = NeonCyan,
    onSecondary = VillainBlack,
    tertiary = BloodRed,
    background = VillainBlack,
    onBackground = TextWhite,
    surface = VillainDarkGray,
    onSurface = TextWhite,
    error = BloodRed
)

@Composable
fun OXVOXTheme(
    darkTheme: Boolean = true, // Dipaksa dark theme untuk nuansa Villain
    content: @Composable () -> Unit
) {
    val colorScheme = VillainColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
