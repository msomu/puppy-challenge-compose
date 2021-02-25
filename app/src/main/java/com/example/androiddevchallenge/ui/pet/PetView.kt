/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.pet

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.repository.Pet
import com.example.androiddevchallenge.repository.SamplePetProvider
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetCard(navController: NavController, @PreviewParameter(SamplePetProvider::class)pet: Pet) {
    Column(
        modifier = Modifier.padding(8.dp)
            .clickable(onClick = { navController.navigate("pet_detail/${pet.id}") })
    ) {
        CoilImage(data = pet.url, null, Modifier.height(120.dp), contentScale = ContentScale.Crop)
        Row {
            Text(text = "by ${pet.name}", style = MaterialTheme.typography.subtitle2)
            Spacer(modifier = Modifier.padding(2.dp))
            if (pet.gender)
                Icon(Icons.Filled.Male, "male", tint = Color.Blue)
            else
                Icon(Icons.Filled.Female, "female", tint = Color.Red)
        }
        Text(
            text = pet.altDescription.capitalize(),
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray
            )
        )
    }
}
