package com.example.videoplayerproj.data.repositories

import com.example.videoplayerproj.data.datasource.MediaDataSource
import com.example.videoplayerproj.data.models.toMediaDomainModel
import com.example.videoplayerproj.domain.models.MediaDomainModel
import com.example.videoplayerproj.domain.repositories.MediaRepo
import javax.inject.Inject

class MediaRepoImp @Inject constructor(val mediaDataSource : MediaDataSource) : MediaRepo {
    override fun getMediaInfo(): MediaDomainModel {
        return mediaDataSource.getMediaInfo().toMediaDomainModel()
    }
}