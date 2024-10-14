package com.example.submissionawalaplikasidicodingevent.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.submissionawalaplikasidicodingevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TAG = "MainActivity"
        private const val
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}