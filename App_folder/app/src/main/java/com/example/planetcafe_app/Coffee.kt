package com.example.planetcafe_app

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coffee(
    val title: String,
    val info: String,
    val imageResource: Int // identyfikatory są przechowywane jako int
):Parcelable