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
package com.example.androiddevchallenge.repository

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import kotlin.random.Random

class SamplePetProvider : PreviewParameterProvider<Pet> {
    override val values = sequenceOf(
        Pet(
            color = "#0c73a6",
            url = "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwxfHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
            totalLikes = 317,
            altDescription = "brown french bulldog wearing yellow shirt",
            gender = false,
            id = 1,
            name = "Karsten Winegeart",
        ),
        Pet(
            color = "#402626",
            url = "https://images.unsplash.com/photo-1552053831-71594a27632d?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwyfHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
            totalLikes = 1,
            altDescription = "yellow Labrador retriever biting yellow tulip flower",
            gender = true,
            id = 2,
            name = "Richard Brutyo",
        )
    )
}

class SamplePetIdProvider : PreviewParameterProvider<Int> {
    override val values = sequenceOf(1, 2)
}

data class Pet(
    val id: Int,
    val color: String,
    val url: String,
    val altDescription: String,
    val gender: Boolean,
    val totalLikes: Int,
    val name: String
)

fun generatePetData() = listOf(
    Pet(
        color = "#0c73a6",
        name = "Karsten Winegeart",
        url = "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwxfHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 317,
        altDescription = "brown french bulldog wearing yellow shirt",
        gender = Random.nextBoolean(),
        id = 1
    ),
    Pet(
        color = "#402626",
        name = "Richard Brutyo",
        url = "https://images.unsplash.com/photo-1552053831-71594a27632d?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwyfHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 1,
        altDescription = "yellow Labrador retriever biting yellow tulip flower",
        gender = Random.nextBoolean(),
        id = 2
    ),
    Pet(
        color = "#d9f3f3",
        name = "Pauline Loroy",
        url = "https://images.unsplash.com/photo-1587300003388-59208cc962cb?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwzfHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 179,
        altDescription = "white and brown long coat large dog",
        gender = Random.nextBoolean(),
        id = 5
    ),
    Pet(
        color = "#262626",
        name = "Fredrik Öhlander",
        url = "https://images.unsplash.com/photo-1516371535707-512a1e83bb9a?ixlib=rb-1.2.1\u0026q=80\u0026fm=jpg\u0026crop=entropy\u0026cs=tinysrgb\u0026w=1080\u0026fit=max",
        totalLikes = 36,
        altDescription = "short-coated brown dog",
        gender = Random.nextBoolean(),
        id = 6
    ),
    Pet(
        color = "#d9a640",
        name = "Karsten Winegeart",
        url = "https://images.unsplash.com/photo-1583512603805-3cc6b41f3edb?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw0fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 317,
        altDescription = "brown french bulldog puppy lying on yellow textile",
        gender = Random.nextBoolean(),
        id = 8
    ),
    Pet(
        color = "#d97326",
        name = "Alvan Nee",
        url = "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw1fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 66,
        altDescription = "short-coated brown and white puppy sitting on floor",
        gender = Random.nextBoolean(),
        id = 9
    ),
    Pet(
        color = "#d9d9d9",
        name = "T.R Photography",
        url = "https://images.unsplash.com/photo-1560807707-8cc77767d783?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw2fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 47,
        altDescription = "long-coated white and brown puppy",
        gender = Random.nextBoolean(),
        id = 10
    ),
    Pet(
        color = "#262626",
        name = "Fredrik Öhlander",
        url = "https://images.unsplash.com/photo-1516371535707-512a1e83bb9a?ixlib=rb-1.2.1\u0026q=80\u0026fm=jpg\u0026crop=entropy\u0026cs=tinysrgb\u0026w=1080\u0026fit=max",
        totalLikes = 36,
        altDescription = "short-coated brown dog",
        gender = Random.nextBoolean(),
        id = 11
    ),
    Pet(
        color = "#f3f3f3",
        name = "Wai Siew",
        url = "https://images.unsplash.com/photo-1544197807-bb503430e22d?ixlib=rb-1.2.1\u0026q=80\u0026fm=jpg\u0026crop=entropy\u0026cs=tinysrgb\u0026w=1080\u0026fit=max",
        totalLikes = 516,
        altDescription = "medium-coated tan puppy on white textile",
        gender = Random.nextBoolean(),
        id = 13
    ),
    Pet(
        color = "#a68c73",
        name = "Marliese Streefland",
        url = "https://images.unsplash.com/photo-1543466835-00a7907e9de1?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw3fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 296,
        altDescription = "dog's face",
        gender = Random.nextBoolean(),
        id = 14
    ),
    Pet(
        color = "#a67359",
        name = "Celine Sayuri Tagami",
        url = "https://images.unsplash.com/photo-1510771463146-e89e6e86560e?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw4fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 1,
        altDescription = "dog holding flower",
        gender = Random.nextBoolean(),
        id = 15
    ),
    Pet(
        color = "#f3f3f3",
        name = "Oscar Sutton",
        url = "https://images.unsplash.com/photo-1530281700549-e82e7bf110d6?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHw5fHxkb2d8ZW58MHx8fA\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 71,
        altDescription = "dog running on beach during daytime",
        gender = Random.nextBoolean(),
        id = 16
    ),
    Pet(
        color = "#262626",
        name = "Fredrik Öhlander",
        url = "https://images.unsplash.com/photo-1516371535707-512a1e83bb9a?ixlib=rb-1.2.1\u0026q=80\u0026fm=jpg\u0026crop=entropy\u0026cs=tinysrgb\u0026w=1080\u0026fit=max",
        totalLikes = 36,
        altDescription = "short-coated brown dog",
        gender = Random.nextBoolean(),
        id = 17
    ),
    Pet(
        color = "#f3f3c0",
        name = "Judah Legge",
        url = "https://images.unsplash.com/photo-1492534513006-37715f336a39?ixlib=rb-1.2.1\u0026q=80\u0026fm=jpg\u0026crop=entropy\u0026cs=tinysrgb\u0026w=1080\u0026fit=max",
        totalLikes = 4,
        altDescription = "selective focus photography of giraffe",
        gender = Random.nextBoolean(),
        id = 18
    ),
    Pet(
        color = "#735940",
        name = "cristian castillo",
        url = "https://images.unsplash.com/photo-1576201836106-db1758fd1c97?crop=entropy\u0026cs=tinysrgb\u0026fit=max\u0026fm=jpg\u0026ixid=MXwxNDcwNjd8MHwxfHNlYXJjaHwxMHx8ZG9nfGVufDB8fHw\u0026ixlib=rb-1.2.1\u0026q=80\u0026w=1080",
        totalLikes = 91,
        altDescription = "yellow Labrador puppy running on field",
        gender = Random.nextBoolean(),
        id = 19
    ),
)
