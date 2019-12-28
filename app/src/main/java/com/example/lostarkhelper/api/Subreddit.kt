package com.example.lostarkhelper.api

import com.google.gson.annotations.SerializedName

data class Subreddit (
    @SerializedName("kind") var text: String,
    @SerializedName("number") var number: String,
    @SerializedName("found") var found: String,
    @SerializedName("type") var type: String
)