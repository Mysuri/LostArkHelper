package com.example.lostarkhelper.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.R
import com.example.lostarkhelper.model.BerserkerSkills
import com.example.lostarkhelper.ui.classes.CustomItemClickListener
import kotlinx.android.synthetic.main.row_skill.view.*

class BerserkerAdapter(private val skills: List<BerserkerSkills>) :
    RecyclerView.Adapter<BerserkerAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun getItemCount(): Int {
        return skills.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(skills[position])

        holder.setOnCustomItemClickListener(object :
            CustomItemClickListener {
            override fun onCustomItemClickListener(view: View, position: Int) {

            }
        })
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
        fun bind(place: BerserkerSkills) {
            itemView.ivSkill.setImageDrawable(context.getDrawable(place.imageResId))
            itemView.tvSkillTitle.text = place.skillTitle
            itemView.tvSkillDesc.text = place.skillDesc
        }

        fun setOnCustomItemClickListener(itemClickListener: CustomItemClickListener) {
            this.customItemClickListener = itemClickListener
        }

        override fun onClick(v: View?) {
            this.customItemClickListener!!.onCustomItemClickListener(v!!, adapterPosition)
        }
    }
}