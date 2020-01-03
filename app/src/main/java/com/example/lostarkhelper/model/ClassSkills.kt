package com.example.lostarkhelper.model

import androidx.annotation.DrawableRes
import com.example.lostarkhelper.R

data class ClassSkills (
    var skillTitle : String,
    var skillStatus : String,
    var skillDescription : String,
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

        val BERSERKER_SKILL_STATUS = arrayOf(
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

        val BERSERKER_SKILL_DESCRIPTIONS = arrayOf(
            "Deals 71 damage with his sword and jump, inflicting additional 133 damage to enemies in the air and crushing them to the ground.",
            "Charge forward, inflicting 83 damage to enemies on the way.",
            "Spin with your sword to deals 586 damage over 4 seconds.",
            "Swing the sword and cause 82x2 damage.",
            "Deals 148 damage with his sword.",
            "Deals 418 damage with his sword.",
            "Concentrate energy into the sword to deal 347 damage and knockback enemies.",
            "Charge forward and swing sword to deal 134 damage and throw enemies into the air, and deal additional 94-94-215 in the row.",
            "Powerful stomp, dealing 143 damage and creates earthquake for 2s.",
            "Jump and crush the enemies with his sword dealing 134 damage and knocking them down.",
            "Stab sword into the ground deals 49 damage, enabling you to hold for up to 2s dealing 143 damage. By successfully hit perfect zone, deal additional 771 damage and throw enemies into the air.",
            "Deal a diagonal sword strike that deals 130 damage and throws enemies in the air.",
            "Swing your sword around while moving to deal 425 damage.",
            "Strike with your sword to deal 185 damage, and pull the sword out of the ground to deal 123 damage and pull the enemy towards you.",
            "Attack can be charged on 2 levels that smash the ground with a beam, inflicting 349 damage at first level and 873 at second.",
            "Deals 351 damage. Increases damage by 12% for 6 seconds.",
            "Jump and create a black storm dealing 507 damage, throws the enemies in the air.",
            "Slash into the air, causing a wave of energy which does 291 ranged attack damage."
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