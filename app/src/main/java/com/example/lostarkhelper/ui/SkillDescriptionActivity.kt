package com.example.lostarkhelper.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.lostarkhelper.R
import com.example.lostarkhelper.adapter.SkillDescriptionAdapter
import com.example.lostarkhelper.model.ClassSkills
import kotlinx.android.synthetic.main.activity_skill_description.*

class SkillDescriptionActivity : AppCompatActivity() {

    private var skillDescriptions = arrayListOf<ClassSkills>()
    private var skillDescriptionAdapter = SkillDescriptionAdapter(skillDescriptions)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_description)

        var skillImage = intent.getIntExtra("skillImage", 0)
        var skillTitle: String = intent.getStringExtra("skillTitle")
        var skillDescription: String = intent.getStringExtra("skillDescription")
        var skillStatus: String = intent.getStringExtra("skillStatus")

        supportActionBar?.title = ""

        //Init skill values
        ivSkillDescImage.setImageDrawable(this.getDrawable(skillImage))
        tvSkillDescTitle.text = skillTitle
        tvSkillDescription.text = skillDescription
        tvSkillStatus.text = skillStatus

        //Back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        skillDescriptionAdapter.notifyDataSetChanged()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
