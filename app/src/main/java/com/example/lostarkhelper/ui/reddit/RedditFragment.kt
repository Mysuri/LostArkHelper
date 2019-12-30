package com.example.lostarkhelper.ui.reddit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        redditViewModel.getRandomTrivia()

        redditViewModel.score1.observe(this, Observer {
            tvScore1.text = it
        })

        redditViewModel.comment1.observe(this, Observer {
            tvComment1.text = it
        })

        redditViewModel.date1.observe(this, Observer {
            tvDate1.text = it
        })

        redditViewModel.error.observe(this, Observer {
            txtError.visibility = View.VISIBLE
            txtError.text = it
        })

        redditViewModel.text1.observe(this, Observer {
            txtPost1.text = it
            if (!txtPost1.text.isNullOrEmpty()) {
                rvPost1.visibility = View.VISIBLE
                ivLike1.visibility = View.VISIBLE
                tvScore1.visibility = View.VISIBLE
                ivComment1.visibility = View.VISIBLE
                tvDate1.visibility = View.VISIBLE
            }
        })
        return root
    }
}