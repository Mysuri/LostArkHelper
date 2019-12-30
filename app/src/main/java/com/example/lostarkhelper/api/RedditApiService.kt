package com.example.lostarkhelper.api

import retrofit2.Call
import retrofit2.http.GET

interface RedditApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("top.json?limit=2")
    fun getSubredditInfo(): Call<Subreddit>
}