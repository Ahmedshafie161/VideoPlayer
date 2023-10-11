package com.example.videoplayerproj.data.datasource

import com.example.videoplayerproj.data.models.MediaDataModel


interface MediaDataSource {
    fun getMediaInfo(): MediaDataModel
}