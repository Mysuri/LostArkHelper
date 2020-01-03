package com.example.lostarkhelper.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.R
import com.example.lostarkhelper.model.ClassSkills
import com.example.lostarkhelper.ui.SkillDescriptionActivity
import com.example.lostarkhelper.util.CustomItemClickListener
import kotlinx.android.synthetic.main.activity_skill_description.view.*
import kotlinx.android.synthetic.main.item_skilldescription.view.*
import kotlinx.android.synthetic.main.row_skill.view.*

class SkillDescriptionAdapter(private val skills: List<ClassSkills>) :
    RecyclerView.Adapter<SkillDescriptionAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun getItemCount(): Int {
        return skills.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(skills[position])

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_skill, parent, false)
        )
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        private var customItemClickListener: CustomItemClickListener? = null
        fun bind(place: ClassSkills) {
            itemView.ivSkillDescImage.setImageDrawable(context.getDrawable(place.imageResId))
            itemView.tvSkillTitle.text = place.skillTitle
            itemView.tvSkillDesc.text = place.skillStatus
        }

        override fun onClick(v: View?) {
            this.customItemClickListener!!.onCustomItemClickListener(v!!, adapterPosition)
        }
    }
}