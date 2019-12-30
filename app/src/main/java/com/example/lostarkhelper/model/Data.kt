package com.example.lostarkhelper.model

data class Data(
    val after: Any,
    val before: Any,
    val children: List<Children>,
    val dist: Int,
    val modhash: String
)