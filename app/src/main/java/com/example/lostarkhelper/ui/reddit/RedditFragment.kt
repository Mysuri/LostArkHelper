package com.example.lostarkhelper.ui.reddit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.lostarkhelper.R
import kotlinx.android.synthetic.main.fragment_reddit.*

class RedditFragment : Fragment() {

    private lateinit var redditViewModel: RedditViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        redditViewModel = ViewModelProviders.of(this).get(RedditViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_reddit, container, false)
        val textView: TextView = root.findViewById(R.id.txtPost1)
        redditViewModel.getRandomTrivia()
        redditViewModel.text1.observe(this, Observer {
            textView.text = it
            if (!textView.text.isNullOrEmpty()) {
                rvPost1.visibility = View.VISIBLE
                ivLike1.visibility = View.VISIBLE
            }
        })
        return root
    }
}