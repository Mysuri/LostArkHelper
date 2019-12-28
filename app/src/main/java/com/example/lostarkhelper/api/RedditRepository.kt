package com.example.lostarkhelper.api

class RedditRepository {
    private val redditApi: RedditApiService = RedditApi.createApi()

    fun getSubreddits() = redditApi.getSubredditInfo()
}