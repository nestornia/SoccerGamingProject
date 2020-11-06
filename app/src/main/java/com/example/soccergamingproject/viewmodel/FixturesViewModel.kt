package com.example.soccergamingproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soccergamingproject.data.Repository
import com.example.soccergamingproject.model.FixturesResponse
import kotlinx.coroutines.launch

class FixturesViewModel : ViewModel() {

    private val _fixtures = MutableLiveData<FixturesResponse>()
    val fixturesObservable: LiveData<FixturesResponse>
        get() = _fixtures

    init {
        getFixtures()
    }

    private fun getFixtures() = viewModelScope.launch {
        val response = Repository.getFixtures()
    }

}