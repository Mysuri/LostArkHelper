package com.example.lostarkhelper.api

data class Data(
    val after: Any,
    val before: Any,
    val children: List<Children>,
    val dist: Int,
    val modhash: String
)