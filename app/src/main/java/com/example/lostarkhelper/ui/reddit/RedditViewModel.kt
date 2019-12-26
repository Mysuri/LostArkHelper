package com.example.lostarkhelper.ui.reddit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RedditViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reddit Fragment"
    }
    val text: LiveData<String> = _text
}