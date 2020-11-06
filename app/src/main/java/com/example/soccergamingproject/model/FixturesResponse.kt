package com.example.soccergamingproject.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class FixturesResponse(
        val fixtures: MutableList<FixturesItem> = mutableListOf()
): Parcelable