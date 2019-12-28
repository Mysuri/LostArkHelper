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

class RedditFragment : Fragment() {

    private lateinit var redditViewModel: RedditViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        redditViewModel = ViewModelProviders.of(this).get(RedditViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_reddit, container, false)
        val textView: TextView = root.findViewById(R.id.text_reddit)
        redditViewModel.getRandomTrivia()
        redditViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}