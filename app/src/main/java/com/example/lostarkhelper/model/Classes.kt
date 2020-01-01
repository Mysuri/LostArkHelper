package com.example.lostarkhelper.model

import androidx.annotation.DrawableRes
import com.example.lostarkhelper.R

data class Classes(
    var name: String,
    @DrawableRes var imageResId: Int
) {
    companion object {
        val PLACE_NAMES = arrayOf(
            "Berserker",
            "Destroyer",
            "Warlord",
            "Battle Master",
            "Infighter",
            "Soul Master",
            "Blaster",
            "Devil Hunter",
            "Hawkeye ",
            "Arcana",
            "Bard",
            "Summoner"
        )

        val PLACE_RES_DRAWABLE_IDS = arrayOf(
            R.drawable.class_berserker,
            R.drawable.class_destroyer,
            R.drawable.class_warlord,
            R.drawable.class_battlemaster,
            R.drawable.class_infighter,
            R.drawable.class_soulmaster,
            R.drawable.class_blaster,
            R.drawable.class_devilhunter,
            R.drawable.class_hawkeye,
            R.drawable.class_arcana,
            R.drawable.class_bard,
            R.drawable.class_summoner

        )
    }
}