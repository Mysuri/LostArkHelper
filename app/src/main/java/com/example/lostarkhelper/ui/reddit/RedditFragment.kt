package com.example.lostarkhelper.ui.reddit

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
            pbLoading.visibility = View.INVISIBLE
        })

        redditViewModel.score2.observe(this, Observer {
            tvScore2.text = it
        })
        redditViewModel.comment2.observe(this, Observer {
            tvComment2.text = it
        })
        redditViewModel.date2.observe(this, Observer {
            tvDate2.text = it
        })
        redditViewModel.text2.observe(this, Observer {
            tvPost2.text = it
        })



        redditViewModel.text1.observe(this, Observer {
            tvPost1.text = it
            if (!tvPost1.text.isNullOrEmpty()) {
                rvPost1.visibility = View.VISIBLE
                ivLike1.visibility = View.VISIBLE
                tvScore1.visibility = View.VISIBLE
                ivComment1.visibility = View.VISIBLE
                tvDate1.visibility = View.VISIBLE

                rvPost2.visibility = View.VISIBLE
                ivLike2.visibility = View.VISIBLE
                tvScore2.visibility = View.VISIBLE
                ivComment2.visibility = View.VISIBLE
                tvDate2.visibility = View.VISIBLE

                pbLoading.visibility = View.INVISIBLE
            }
        })
        return root
    }
}