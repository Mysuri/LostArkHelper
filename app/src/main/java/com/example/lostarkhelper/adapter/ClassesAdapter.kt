package com.example.lostarkhelper.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lostarkhelper.ui.BerserkerActivity
import com.example.lostarkhelper.R
import com.example.lostarkhelper.model.Classes
import com.example.lostarkhelper.ui.classes.CustomItemClickListener
import kotlinx.android.synthetic.main.row_class.view.*

class ClassesAdapter(private val classes: ArrayList<Classes>) :
    RecyclerView.Adapter<ClassesAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun getItemCount(): Int {
        return classes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(classes[position])

        holder.setOnCustomItemClickListener(object : CustomItemClickListener {
            override fun onCustomItemClickListener(view: View, position: Int) {
                val intent = Intent(context, BerserkerActivity::class.java)
                intent.putExtra("className", classes[position].name)
                context.startActivity(intent)
            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_class, parent, false)
        )
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        private var customItemClickListener: CustomItemClickListener? = null

        fun bind(place: Classes) {
            itemView.ivClass.setImageDrawable(context.getDrawable(place.imageResId))
            itemView.tvClassName.text = place.name
        }

        fun setOnCustomItemClickListener(itemClickListener: CustomItemClickListener) {
            this.customItemClickListener = itemClickListener
        }

        override fun onClick(v: View?) {
            this.customItemClickListener!!.onCustomItemClickListener(v!!, adapterPosition)
        }
    }
}
