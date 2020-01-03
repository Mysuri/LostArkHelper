package com.example.lostarkhelper.model

import androidx.annotation.DrawableRes
import com.example.lostarkhelper.R

data class ClassSkills (
    var skillTitle : String,
    var skillDesc : String,
    @DrawableRes var imageResId : Int

) {
    companion object {
        val BERSERKER_SKILL_NAMES = arrayOf(
            "Hazardous Crime",
            "Shoulder Charge",
            "Whirlwind",
            "Double Slash",
            "Assault Blade",
            "Finishing Strike",
            "Power Break",
            "Tempest Slash",
            "Mountain Crash",
            "Diving Slash",
            "Hell Blade",
            "Chain Sword",
            "Wind Blade",
            "Maelstorm",
            "Strike Wave",
            "Red Dust",
            "Blade Storm",
            "Aurora Blade"
        )

        val BERSERKER_SKILL_DESCRIPTIONS = arrayOf(
            "Normal",
            "Normal",
            "Hold 4 sec",
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Combo",
            "Normal",
            "Point",
            "Hold 2.5 sec",
            "Normal",
            "Normal",
            "Combo",
            "Hold",
            "Normal",
            "Normal",
            "Normal"
        )

        val BERSERKER_SKILL_IMAGES = arrayOf(
            R.drawable.c02s01,
            R.drawable.c02s02,
            R.drawable.c02s03,
            R.drawable.c02s06,
            R.drawable.c02s07,
            R.drawable.c02s12,
            R.drawable.c02s00,
            R.drawable.c02s09,
            R.drawable.c02s11,
            R.drawable.c02s10,
            R.drawable.c02s04,
            R.drawable.c02s14,
            R.drawable.c02s16,
            R.drawable.c02s17,
            R.drawable.c02s05,
            R.drawable.c02s08,
            R.drawable.c02s15,
            R.drawable.c02s13
        )

        val DESTROYER_SKILL_NAMES = arrayOf(
            "Heavy Crush",
            "Gravity Impact",
            "Dreadnought",
            "Power Strike",
            "Jumping Smash",
            "Power Shoulder",
            "Neutralizer",
            "Running Crash",
            "Gravity Force",
            "Endure Pain",
            "Earth Smasher",
            "Earth Eater",
            "Full Swing",
            "One Man Army",
            "Perfect Swing",
            "Gravity Compression",
            "Seismic Hammer"
        )

        val DESTROYER_SKILL_DESCRIPTIONS = arrayOf(
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Point",
            "Combo",
            "Combo",
            "Hold",
            "Chain",
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Hold",
            "Charge",
            "Hold",
            "Normal"
        )

        val DESTROYER_SKILL_IMAGES = arrayOf(
            R.drawable.c00s00,
            R.drawable.c00s01,
            R.drawable.c00s06,
            R.drawable.c00s12,
            R.drawable.c00s10,
            R.drawable.c00s16,
            R.drawable.c00s05,
            R.drawable.c00s15,
            R.drawable.c00s14,
            R.drawable.c00s08,
            R.drawable.c00s03,
            R.drawable.c00s09,
            R.drawable.c00s02,
            R.drawable.c00s04,
            R.drawable.c00s11,
            R.drawable.c00s13,
            R.drawable.c00s07
        )

        val WARLORD_SKILL_NAMES = arrayOf(
            "Sharp Spear",
            "Bash",
            "Fire Bullet",
            "Rising Spear",
            "Dash Upper Fire",
            "Shield Slam",
            "Jump Attack",
            "Guardian's Lighting",
            "Chain Hook",
            "Shield Charge",
            "Charge Stinger",
            "Shout of Hate",
            "Turbulent Shield",
            "Counter Sphere",
            "Strength of Nellasia",
            "Spear Shot",
            "Burst Cannon"
        )

        val WARLORD_SKILL_DESCRIPTIONS = arrayOf(
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Combo",
            "Combo",
            "Point",
            "Normal",
            "Normal",
            "Hold 2 sec",
            "Charge",
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Normal",
            "Normal"
        )

        val WARLORD_SKILL_IMAGES = arrayOf(
            R.drawable.c01s00,
            R.drawable.c01s01,
            R.drawable.c01s03,
            R.drawable.c01s04,
            R.drawable.c01s05,
            R.drawable.c01s11,
            R.drawable.c01s08,
            R.drawable.c01s10,
            R.drawable.c01s06,
            R.drawable.c01s02,
            R.drawable.c01s16,
            R.drawable.c01s13,
            R.drawable.c01s07,
            R.drawable.c01s14,
            R.drawable.c01s09,
            R.drawable.c01s12,
            R.drawable.c01s15
        )
    }
}