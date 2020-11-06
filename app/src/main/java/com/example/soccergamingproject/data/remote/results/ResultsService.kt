package com.example.soccergamingproject.data.remote.results

import com.example.soccergamingproject.model.ResultsItem
import com.example.soccergamingproject.model.ResultsResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET

interface ResultsService {

    @GET("/cdn-og-test-api/test-task/results.json")
    suspend fun getResults() : ResultsResponse
}