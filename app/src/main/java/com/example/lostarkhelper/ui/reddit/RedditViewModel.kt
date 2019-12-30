package com.example.lostarkhelper.ui.reddit

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lostarkhelper.R
import com.example.lostarkhelper.api.RedditRepository
import com.example.lostarkhelper.model.Subreddit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class RedditViewModel : ViewModel() {

    private val numbersRepository = RedditRepository()

    //1st Post
    val error = MutableLiveData<String>()
    val comment1 = MutableLiveData<String>()
    val date1 = MutableLiveData<String>()
    val score1 = MutableLiveData<String>()
    val text1 = MutableLiveData<String>()

    //2nd Post
    val comment2 = MutableLiveData<String>()
    val date2 = MutableLiveData<String>()
    val score2 = MutableLiveData<String>()
    val text2 = MutableLiveData<String>()

    fun getRandomTrivia() {
        numbersRepository.getSubreddits().enqueue(object : Callback<Subreddit> {
            override fun onResponse(call: Call<Subreddit>, response: Response<Subreddit>) {
                if (response.isSuccessful) {
                    text1.value = response.body()?.data?.children?.get(0)?.data?.title
                    score1.value = response.body()?.data?.children?.get(0)?.data?.score.toString()
                    comment1.value =
                        response.body()?.data?.children?.get(0)?.data?.num_comments.toString()
                    date1.value =
                        response.body()?.data?.children?.get(0)?.data?.created_utc?.toLong()?.let {
                            epochToDate(it)
                        }

                    text2.value = response.body()?.data?.children?.get(1)?.data?.title
                    score2.value = response.body()?.data?.children?.get(1)?.data?.score.toString()
                    comment2.value =
                        response.body()?.data?.children?.get(1)?.data?.num_comments.toString()
                    date2.value =
                        response.body()?.data?.children?.get(1)?.data?.created_utc?.toLong()?.let {
                            epochToDate(it)
                        }

                } else {
                    error.value = "An error occurred: ${response.errorBody().toString()}"
                }
            }

            override fun onFailure(call: Call<Subreddit>, t: Throwable) {
                error.value = "No internet connection"
            }
        })
    }

    fun epochToDate(epochSeconds: Long): String {
        val updateDate = Date(Integer.parseInt(epochSeconds.toString()) * 1000L)
        val format = SimpleDateFormat("yyyy/MM/dd \t HH:mm")
        return format.format(updateDate)
    }
}