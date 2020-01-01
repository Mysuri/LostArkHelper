package com.example.lostarkhelper.ui.classes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.R
import com.example.lostarkhelper.model.Classes
import kotlinx.android.synthetic.main.row_class.view.*

class ClassesAdapter(private val classes: List<Classes>) :
    RecyclerView.Adapter<ClassesAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun getItemCount(): Int {
        return classes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(classes[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_class, parent, false)
        )
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place : Classes) {
            itemView.ivPi.setImageDrawable(context.getDrawable(place.imageResId))
            itemView.tvClassName.text = place.name
        }
    }
}
