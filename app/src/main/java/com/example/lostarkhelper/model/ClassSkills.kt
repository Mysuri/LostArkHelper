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

        val DESTROYER_SKILL_STATUS = arrayOf(
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

        val DESTROYER_SKILL_DESCRIPTIONS = arrayOf(
            "Infuses your hammer with gravity energy and then slams it down in front of you",
            "You hit down to inflict 50 damage, and you create a gravity zone. The area deals 8 times 148 total damage to the enemies and draws them to its center. Then the area explodes to inflict 50 damage again.",
            "Concentrates gravity energy within your hammer, then smashes it to the ground dealing 97 damage. Launches you into the air, dealing 123 damage to foes upon landing.",
            "Raises your hammer and deal three brutal strikes 92-129-147 damage.",
            "Leap high in the air towards a target location up to 10m away and inflict 250 damage to nearby foes upon landing.",
            "Charge 5m forward, dealing 63 damage to enemies. An additional combo attack deals 187 damage with an upward strike.",
            "Hits with 88 damage, and creates shock wave within 8m of the target location dealing 162 damage. You can use the skill 2 more times. The second hit inflicts 132 damage, and the third hit inflicts 176 damage.",
            "While holding down the hotkey, you hit enemies in front of you, and damage up to 7 times for 317 total damage. Upon releasing the key an explosion that deals 104 damage.",
            "Swings the hammer in front of you, dealing 28 damage. The hammer creates a gravity energy beam in front you dealing 157 total damage to enemies. They are pulled towards you and take 67 damage.",
            "Deals 382 damage in 2m radius, you will have 15% reduction in damage and immune to control effects for 5 seconds.",
            "Deals 154 damage. It creates a rock on the landing location. You destroy the rock and particles from the rock scatter in a fan-shaped angle, dealing 417 damage. Successful hits by the particles stun enemies for 3 seconds.",
            "Slams the ground behind you dealing 210 damage. Then swings the hammer to the front. The first swing inflicts 46 damage, the second 59, and the third 71. After the 3 swing, you strike the ground dealing 252 damage.",
            "Swings the hammer 3 times like whirlwind. The first and second swings inflict 76-87-190 damage in the raw. Last hit can be overcharged to 380 damage.",
            "Swing the hammer left and right. First hit inflicts 62 damage. Continual swings increase over the time and the last hit deals 114 damage.",
            "Moves forward and tackles an enemy for 89 damage, then hits the hammer for 400 damage. You can charge the skill for 2 seconds. When fully charged, the skill moves 2m farther and the hammer strike deals 800 damage.",
            "Creates a black hole that deals 22 damage. You can hold gravity energy into the black hole for 2 seconds, which then spreads in all directions, dealing 201 damage. Releasing the hotkey explodes the black hole for 113, full charged black hole deals 226 damage.",
            "Hold the hammer upside down, then leap in the air and smashing the ground for 77. After the impact, the skill creates a 5m cone-shaped wall which deals 687 damage."
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