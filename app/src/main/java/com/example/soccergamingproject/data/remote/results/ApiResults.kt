package com.example.soccergamingproject.data.remote.results

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiResults {

    private const val BASE_URL = "https://storage.googleapis.com/"

    private fun loggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private fun setupClient() = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor())
            .build()

    private fun retrofitInstance() = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(setupClient())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    fun getResultsService() = retrofitInstance().create(ResultsService::class.java)

}