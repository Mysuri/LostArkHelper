package com.example.lostarkhelper.api

import com.example.lostarkhelper.model.Subreddit
import retrofit2.Call
import retrofit2.http.GET

interface RedditApiService {

    // The GET method needed to retrieve the 5 newest subreddit posts
    @GET("new.json?limit=5&sort=new")
    fun getSubredditInfo(): Call<Subreddit>
}