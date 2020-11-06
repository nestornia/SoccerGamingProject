package com.example.soccergamingproject.data.remote.fixtures

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiFixtures {
    private const val BASE_URL = "https://storage.googleapis.com/"

    private fun loggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private fun setupClient() = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor())
            .build()

    private fun retrofitInstance() = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(setupClient())
            .build()

    fun getFixtures() = retrofitInstance().create(FixturesService::class.java)
}