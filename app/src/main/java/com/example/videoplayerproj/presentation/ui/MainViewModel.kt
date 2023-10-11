package com.example.videoplayerproj.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.datasource.DataSource
import androidx.media3.exoplayer.ExoPlayer
import com.example.videoplayerproj.domain.usecases.MediaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val exoPlayer: ExoPlayer,
    private val dataSourceFactory: DataSource.Factory,
    private val mediaUseCase: MediaUseCase
) : ViewModel() {
    private var player: ExoPlayer? = null

    @androidx.annotation.OptIn(androidx.media3.common.util.UnstableApi::class)
    private fun initPlayer(): ExoPlayer {
        if (player == null) {
            val mediaInfo = mediaUseCase.getMediaInfo()
            player = exoPlayer.apply {
                addMediaItems(mediaUseCase.getMediaInfo().mediaUrlList.map{MediaItem.fromUri(it)})
                prepare()
                addListener(playerListener)
            }
        }
        return player as ExoPlayer
    }

    fun releasePlayer() {
        player?.apply {
            playWhenReady = false
            release()
        }
        player = null
    }

    fun pause() {
        player?.playWhenReady = false
    }

    fun play() {
        player?.playWhenReady = true
    }

    fun restartPlayer() {
        player?.seekTo(0)
        player?.playWhenReady = true
    }

    private val playerListener = object : Player.Listener {
        override fun onPlaybackStateChanged(playbackState: Int) {
            super.onPlaybackStateChanged(playbackState)
            when (playbackState) {
                Player.STATE_ENDED -> restartPlayer()
                Player.STATE_READY -> {
                    // You can update the UI here
                }
            }
        }
    }

    fun initVideoPlayer(): ExoPlayer {
        return initPlayer()
    }

    fun getNextVideo() {
        if (player?.hasNextMediaItem() == true){
            player?.seekToNextMediaItem()
        }
    }

    fun getPreviousVideo(){
        player?.seekToPreviousMediaItem()
    }

}
