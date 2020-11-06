package com.example.soccergamingproject.data

import com.example.soccergamingproject.data.remote.fixtures.ApiFixtures
import com.example.soccergamingproject.data.remote.results.ApiResults

object Repository {

    suspend fun getResults() = ApiResults.getResultsService().getResults()

    suspend fun getFixtures() = ApiFixtures.getFixtures().getFixtures()
}