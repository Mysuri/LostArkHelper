package com.example.lostarkhelper.model

import androidx.annotation.DrawableRes
import com.example.lostarkhelper.R

data class BerserkerSkills (
    var skillTitle : String,
    var skillDesc : String,
    @DrawableRes var imageResId : Int

) {
    companion object {
        val SKILL_NAMES = arrayOf(
            "Hazardous Crime",
            "Shoulder Charge"
        )

        val SKILL_DESCRIPTIONS = arrayOf(
            "Normal",
            "Normal"
        )

        val SKILL_IMAGES = arrayOf(
            R.drawable.c02s01,
            R.drawable.c02s02
        )
    }
}