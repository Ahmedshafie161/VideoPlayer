package com.example.videoplayerproj.data.datasource.remote

import com.example.videoplayerproj.data.datasource.MediaDataSource
import com.example.videoplayerproj.data.models.MediaDataModel
import javax.inject.Inject

class MediaRemoteDataSource @Inject constructor() : MediaDataSource {
    override fun getMediaInfo(): MediaDataModel {
        val mediaUrlList =
            listOf(
                "https://testios4devsimp.blob.core.windows.net/blobs/1280.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/dearborn_st_bridge_4k.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/file_example_MP4_1280_10MG.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/Fish_Eats.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/SampleVideo_1280x720_1mb.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/subwaytrain.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/tiger.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D",
                "https://testios4devsimp.blob.core.windows.net/blobs/unistudiosglobe.mp4?sp=r&st=2023-10-10T10:07:09Z&se=2023-10-15T18:07:09Z&spr=https&sv=2022-11-02&sr=c&sig=VH1ycuDRIWkVlQaq%2BF3pUQF%2Bao0mmrt31637%2B5BUnD0%3D"
            )
        return MediaDataModel(mediaUrlList)
    }
}