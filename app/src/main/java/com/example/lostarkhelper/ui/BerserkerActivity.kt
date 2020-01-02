package com.example.lostarkhelper.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.R
import com.example.lostarkhelper.adapter.BerserkerAdapter
import com.example.lostarkhelper.model.BerserkerSkills

class BerserkerActivity : AppCompatActivity() {

    private var skills = arrayListOf<BerserkerSkills>()
    private var berserkerAdapter = BerserkerAdapter(skills)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berserker)
        val actionBar = supportActionBar
        val className = intent.getStringExtra("className")

        if (className == null) {
            finish()
            return
        }
        if (actionBar != null) {
            actionBar.title = className
            //Back button
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        //Initialize Recyclerview
        val rvBerserkerSkills = findViewById<RecyclerView>(R.id.rvBerserkerSkills)

        rvBerserkerSkills.layoutManager = LinearLayoutManager(this)
        rvBerserkerSkills.adapter = BerserkerAdapter(skills)


        for (i in BerserkerSkills.SKILL_NAMES.indices) {
            skills.add(BerserkerSkills(BerserkerSkills.SKILL_NAMES[i], BerserkerSkills.SKILL_DESCRIPTIONS[i], BerserkerSkills.SKILL_IMAGES[i]))
        }

        berserkerAdapter.notifyDataSetChanged()
    }

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
