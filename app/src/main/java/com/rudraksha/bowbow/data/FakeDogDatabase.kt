package com.rudraksha.bowbow.data

import com.rudraksha.bowbow.R
import com.rudraksha.bowbow.model.Dog
import com.rudraksha.bowbow.model.Owner

object FakeDogDatabase {
    val owner = Owner("Rudra", "Pet Doctor & Lover", R.drawable.dog_owner)
    val dogList = listOf(
        Dog(
            0,
            "Johnshon",
            3.5,
            "Male",
            "Brown",
            12.9,
            "389m away",
            R.drawable.orange_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            1,
            "Scooby Doo",
            3.5,
            "Male",
            "Gold",
            12.4,
            "412m away",
            R.drawable.blue_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            2,
            "Entertainment",
            3.5,
            "Female",
            "White",
            9.6,
            "879m away",
            R.drawable.red_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            3,
            "Cyrus",
            3.5,
            "Male",
            "Black",
            8.2,
            "672m away",
            R.drawable.yellow_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            4,
            "Shelby",
            3.5,
            "Female",
            "Choco",
            14.9,
            "982m away",
            R.drawable.white_dog,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )
    )
}
