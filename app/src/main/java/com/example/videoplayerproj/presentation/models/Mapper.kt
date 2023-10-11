package com.example.videoplayerproj.presentation.models

import com.example.videoplayerproj.domain.models.MediaDomainModel

fun MediaDomainModel.toMediaUiModel() = MediaUiModel(
    mediaUrl = this.mediaUrlList ?: emptyList()
)