package com.example.lostarkhelper.ui.reddit

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lostarkhelper.api.RedditRepository
import com.example.lostarkhelper.api.Subreddit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*


class RedditViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reddit Fragment"
    }
    val text: LiveData<String> = _text

    private val numbersRepository = RedditRepository()
    val trivia = MutableLiveData<Subreddit>()
    val error = MutableLiveData<String>()

    fun getRandomTrivia() {
        numbersRepository.getSubreddits().enqueue(object : Callback<Subreddit> {
            override fun onResponse(call: Call<Subreddit>, response: Response<Subreddit>) {
                if (response.isSuccessful) {
                    trivia.value = response.body()
                    Log.e("TEST", response.body()?.data?.children?.get(0)?.data?.title)
                    Log.e("EPOCH",
                        response.body()?.data?.children?.get(0)?.data?.created_utc?.toLong()?.let {
                            epoch2DateString(
                                it
                            )
                        })
                } else {
                    error.value = "An error occurred: ${response.errorBody().toString()}"
                }
            }

            override fun onFailure(call: Call<Subreddit>, t: Throwable) {
                error.value = t.message
                Log.e("ERROR", t.message)
            }
        })
    }

    fun epoch2DateString(epochSeconds: Long) : String {
        val updateDate = Date(Integer.parseInt(epochSeconds.toString()) * 1000L)
        val format = SimpleDateFormat("dd-MM-yyyy HH:mm")
        return format.format(updateDate)
    }
}