package com.example.lostarkhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Use Handler to wait 1 second before opening the CreateProfileActivity.
        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    MainActivity::class.java
                )
            )
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 700)
    }
}
