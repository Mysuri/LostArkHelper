package com.example.lostarkhelper.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.R
import com.example.lostarkhelper.adapter.SkillAdapter
import com.example.lostarkhelper.model.ClassSkills

class BerserkerActivity : AppCompatActivity() {

    private var skills = arrayListOf<ClassSkills>()
    private var berserkerAdapter = SkillAdapter(skills)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
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
        val rvClassSkills = findViewById<RecyclerView>(R.id.rvClassSkills)

        rvClassSkills.layoutManager = LinearLayoutManager(this)
        rvClassSkills.adapter = SkillAdapter(skills)


        for (i in ClassSkills.SKILL_NAMES.indices) {
            skills.add(ClassSkills(ClassSkills.SKILL_NAMES[i], ClassSkills.SKILL_DESCRIPTIONS[i], ClassSkills.SKILL_IMAGES[i]))
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
