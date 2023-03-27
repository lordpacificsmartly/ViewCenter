package com.feature.movie.domain.di

import com.feature.movie.domain.repository.MovieRepository
import com.feature.movie.domain.usecases.GetMovieListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun provideGetMovieListUseCase(movieRepository: MovieRepository): GetMovieListUseCase {
        return GetMovieListUseCase(movieRepository)
    }
}