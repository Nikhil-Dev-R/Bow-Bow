package com.rudraksha.bowbow.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rudraksha.bowbow.component.ItemDogCard
import com.rudraksha.bowbow.component.TopBar
import com.rudraksha.bowbow.model.Dog

@Composable
fun Home(navController: NavHostController, dogList: List<Dog>, toggleTheme: () -> Unit) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Bow Bow",
                onToggle = toggleTheme
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding)
        ) {
            item {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Hey Rudra,",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Adopt a new friend near you!",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
            }
            items(dogList) {
                dogList.forEach {
                    ItemDogCard(
                        it,
                        onItemClicked = { dog ->
                            navController.navigate("details/${dog.id}/${dog.name}/${dog.location}")
                        }
                    )
                }
            }
        }
    }
}
