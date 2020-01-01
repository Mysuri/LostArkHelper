package com.example.lostarkhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class BerserkerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berserker)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = resources.getString(R.string.class_berserker)
            //Back button
            actionBar.setDisplayHomeAsUpEnabled(true)
        }    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
