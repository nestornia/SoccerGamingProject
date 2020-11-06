package com.example.soccergamingproject.data.remote.fixtures

import com.example.soccergamingproject.model.FixturesResponse
import retrofit2.http.GET

interface FixturesService {

    @GET("/cdn-og-test-api/test-task/fixtures.json")
    suspend fun getFixtures() : FixturesResponse
}