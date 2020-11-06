package com.example.soccergamingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.soccergamingproject.databinding.ActivityMainBinding
import com.example.soccergamingproject.viewmodel.FixturesViewModel
import com.example.soccergamingproject.viewmodel.ResultsViewModel

// https://storage.googleapis.com/cdn-og-test-api/test-task/fixtures.json
// https://storage.googleapis.com/cdn-og-test-api/test-task/results.json


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val resultsViewModel by viewModels<ResultsViewModel>()
    private val fixturesViewModel by viewModels<FixturesViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        resultsViewModel.resultsObservable.value
        fixturesViewModel.fixturesObservable.value
    }
}