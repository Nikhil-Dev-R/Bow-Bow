package com.rudraksha.bowbow.navigation

import androidx.annotation.StringRes
import com.rudraksha.bowbow.R

sealed class Screen(val route: String, val title: String) {
    data object Home : Screen("home", "Home")
    data object Details : Screen("details", "Details")
}
