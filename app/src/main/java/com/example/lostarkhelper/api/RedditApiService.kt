package com.example.lostarkhelper.api

import retrofit2.Call
import retrofit2.http.GET

interface RedditApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("new.json?limit=2&sort=new")
    fun getSubredditInfo(): Call<Subreddit>
}