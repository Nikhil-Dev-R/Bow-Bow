package com.rudraksha.bowbow.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rudraksha.bowbow.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String = "Title", onToggle: () -> Unit) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.headlineLarge,
                color = Color(color = 0xFF00FF55)
            )
        },
        actions = {
            AppThemeSwitch(onToggle = { onToggle() })
        }
    )
}

@Composable
fun AppThemeSwitch(onToggle: () -> Unit) {
    val icon = if (isSystemInDarkTheme()) Icons.Filled.DarkMode else Icons.Filled.LightMode

    IconButton(
        onClick = onToggle
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp, 24.dp),
            tint = MaterialTheme.colorScheme.primary
        )
    }
}
