package com.example.soccergamingproject.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class ResultsItem(
    val aggregateScore: AggregateScore,
    val awayTeam: AwayTeam,
    val competitionStage: CompetitionStage,
    val date: String,
    val homeTeam: HomeTeam,
    val id: Int,
    val penaltyScore: PenaltyScore,
    val score: Score,
    val state: String,
    val type: String,
    val venue: Venue
) : Parcelable