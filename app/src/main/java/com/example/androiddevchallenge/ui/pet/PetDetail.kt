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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.repository.SamplePetIdProvider
import com.example.androiddevchallenge.repository.generatePetData
import dev.chrisbanes.accompanist.coil.CoilImage

@Preview("Pet Detail", showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun PetDetail(@PreviewParameter(SamplePetIdProvider::class) petId: Int) {
    val pet = generatePetData().first { it.id == petId }
    Column {
        CoilImage(data = pet.url, null, Modifier.height(180.dp), contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.padding(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Column {
                Text(text = "This photo is taken by")
                Spacer(modifier = Modifier.padding(8.dp))
                Row {
                    Text(text = pet.name, style = MaterialTheme.typography.h6)
                    Spacer(modifier = Modifier.padding(2.dp))
                    if (pet.gender)
                        Icon(Icons.Filled.Male, "male", tint = Color.Blue)
                    else
                        Icon(Icons.Filled.Female, "female", tint = Color.Red)
                }
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                Row {
                    Icon(Icons.Filled.Favorite, "female", tint = Color.Red)
                    Text(textAlign = TextAlign.End, text = "${pet.totalLikes} likes")
                }
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = pet.altDescription.capitalize(),
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.W400,
                fontSize = 12.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray,
            )
        )
        Text(
            text = "Image Source : Unsplash",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily.SansSerif,
            ),
            modifier = Modifier.padding(horizontal = 16.dp),
        )
        Spacer(modifier = Modifier.padding(32.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Button(
                onClick = {
                    // handle button click
                }
            ) {
                Text(text = "Adopt Now")
            }
        }
    }
}
