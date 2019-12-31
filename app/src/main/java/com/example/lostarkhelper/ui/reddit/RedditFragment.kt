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
        redditViewModel.getSubredditInfo()

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

                rvPost3.visibility = View.VISIBLE
                ivLike3.visibility = View.VISIBLE
                tvScore3.visibility = View.VISIBLE
                ivComment3.visibility = View.VISIBLE
                tvDate3.visibility = View.VISIBLE

                rvPost4.visibility = View.VISIBLE
                ivLike4.visibility = View.VISIBLE
                tvScore4.visibility = View.VISIBLE
                ivComment4.visibility = View.VISIBLE
                tvDate4.visibility = View.VISIBLE

                rvPost5.visibility = View.VISIBLE
                ivLike5.visibility = View.VISIBLE
                tvScore5.visibility = View.VISIBLE
                ivComment5.visibility = View.VISIBLE
                tvDate5.visibility = View.VISIBLE

                pbLoading.visibility = View.INVISIBLE
            }
        })

        //Error observer
        redditViewModel.error.observe(this, Observer {
            txtError.visibility = View.VISIBLE
            txtError.text = it
            pbLoading.visibility = View.INVISIBLE
        })

        redditViewModel.score1.observe(this, Observer {
            tvScore1.text = it
        })
        redditViewModel.comment1.observe(this, Observer {
            tvComment1.text = it
        })
        redditViewModel.date1.observe(this, Observer {
            tvDate1.text = it
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

        redditViewModel.score3.observe(this, Observer {
            tvScore3.text = it
        })
        redditViewModel.comment3.observe(this, Observer {
            tvComment3.text = it
        })
        redditViewModel.date3.observe(this, Observer {
            tvDate3.text = it
        })
        redditViewModel.text3.observe(this, Observer {
            tvPost3.text = it
        })

        redditViewModel.score4.observe(this, Observer {
            tvScore4.text = it
        })
        redditViewModel.comment4.observe(this, Observer {
            tvComment4.text = it
        })
        redditViewModel.date4.observe(this, Observer {
            tvDate4.text = it
        })
        redditViewModel.text4.observe(this, Observer {
            tvPost4.text = it
        })

        redditViewModel.score5.observe(this, Observer {
            tvScore5.text = it
        })
        redditViewModel.comment5.observe(this, Observer {
            tvComment5.text = it
        })
        redditViewModel.date5.observe(this, Observer {
            tvDate5.text = it
        })
        redditViewModel.text5.observe(this, Observer {
            tvPost5.text = it
        })
        return root
    }
}