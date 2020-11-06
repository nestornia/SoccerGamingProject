package com.example.soccergamingproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soccergamingproject.data.Repository
import com.example.soccergamingproject.model.ResultsResponse
import kotlinx.coroutines.launch

class ResultsViewModel : ViewModel() {

    private val _results = MutableLiveData<ResultsResponse>()
    val resultsObservable: LiveData<ResultsResponse>
        get() = _results

    init {
        getResults()
    }

    private fun getResults() = viewModelScope.launch {
        val response = Repository.getResults()
    }

}