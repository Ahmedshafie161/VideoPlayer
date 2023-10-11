package com.example.videoplayerproj.di

import android.app.Application
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.ExoPlayer
import com.example.videoplayerproj.data.datasource.MediaDataSource
import com.example.videoplayerproj.data.datasource.remote.MediaRemoteDataSource
import com.example.videoplayerproj.data.repositories.MediaRepoImp
import com.example.videoplayerproj.domain.repositories.MediaRepo
import com.example.videoplayerproj.domain.usecases.MediaUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MediaDataSourceModule {
    @Provides
    fun provideMediaDataSource(): MediaDataSource {
        return MediaRemoteDataSource()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideMediaRepository(mediaDataSource: MediaDataSource): MediaRepo {
        return MediaRepoImp(mediaDataSource)
    }
}

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun proveMediaPlayerUseCase(repository: MediaRepo): MediaUseCase {
        return MediaUseCase(repository)
    }
}

@Module
@InstallIn(SingletonComponent::class)
object ExoPlayerModule {

    @Provides
    fun provideExoPlayer(application: Application): ExoPlayer {
        return ExoPlayer.Builder(application).build()
    }

    @Provides
    fun provideDataSourceFactory(): DataSource.Factory {
        return DefaultHttpDataSource.Factory()
    }
}
