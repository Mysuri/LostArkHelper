package com.example.lostarkhelper.ui.classes

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.lostarkhelper.R
import android.view.MenuInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.lostarkhelper.model.Classes
import kotlinx.android.synthetic.main.fragment_classes.*

class ClassesFragment : Fragment() {

    private lateinit var classesViewModel: ClassesViewModel

    private var classes = arrayListOf<Classes>()
    private var classAdapter = ClassesAdapter(classes)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        classesViewModel = ViewModelProviders.of(this).get(ClassesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_classes, container, false)

        //Initialize Recyclerview
        val rvClasses = root.findViewById(R.id.rvClasses) as RecyclerView

        rvClasses.layoutManager = LinearLayoutManager(activity)
        rvClasses.adapter = ClassesAdapter(classes)

        for (i in Classes.PLACE_NAMES.indices) {
            classes.add(Classes(Classes.PLACE_NAMES[i], Classes.PLACE_RES_DRAWABLE_IDS[i]))
        }

        classAdapter.notifyDataSetChanged()

        return root
    }

//TODO : Create action bar menu switch

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.custom_menu, menu)
//        super.onCreateOptionsMenu(menu, inflater)
//    }


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_delete -> {
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}