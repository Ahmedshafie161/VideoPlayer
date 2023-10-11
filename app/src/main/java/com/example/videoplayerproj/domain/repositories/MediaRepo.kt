package com.example.videoplayerproj.domain.repositories

import com.example.videoplayerproj.domain.models.MediaDomainModel

interface MediaRepo {
    fun getMediaInfo(): MediaDomainModel
}