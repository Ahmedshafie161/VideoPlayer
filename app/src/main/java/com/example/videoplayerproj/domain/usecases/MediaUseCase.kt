package com.example.videoplayerproj.domain.usecases

import com.example.videoplayerproj.domain.repositories.MediaRepo
import javax.inject.Inject

class MediaUseCase @Inject constructor(private val repo:MediaRepo){
    fun getMediaInfo() = repo.getMediaInfo()
}