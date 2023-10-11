package com.example.videoplayerproj.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.videoplayerproj.databinding.ActivityMainLayoutBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainLayoutBinding

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
        initListeners()
    }

    private fun initUi(){
        binding.playerView.player = viewModel.initVideoPlayer()
    }
    private fun initListeners(){
        binding.apply{
            nextBtn.setOnClickListener { viewModel.getNextVideo() }
            previousBtn.setOnClickListener { viewModel.getPreviousVideo() }
        }
    }

    override fun onPause() {
        super.onPause()
        viewModel.pause()
    }

    override fun onResume() {
        super.onResume()
        viewModel.play()
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.releasePlayer()
    }

}


