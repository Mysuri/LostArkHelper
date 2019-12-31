package com.example.lostarkhelper.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RedditApi {
    companion object {
        // The base url of the api.
        private const val baseUrl = "http://reddit.com/r/lostarkgame/"

        /**
         * @return [RedditApiService] The service class off the retrofit client.
         */
        fun createApi(): RedditApiService {
            // Create an OkHttpClient to be able to make a log of the network traffic
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()

            // Create the Retrofit instance
            val numbersApi = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            // Return the Retrofit RedditApiService
            return numbersApi.create(RedditApiService::class.java)
        }
    }
}