package com.example.videoplayerproj.data.models

import com.example.videoplayerproj.domain.models.MediaDomainModel

fun MediaDataModel.toMediaDomainModel() = MediaDomainModel(
    mediaUrlList = this.mediaUrlList?: emptyList(),
)