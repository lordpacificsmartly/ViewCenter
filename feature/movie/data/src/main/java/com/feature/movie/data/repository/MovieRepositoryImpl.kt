package com.feature.movie.data.repository

import com.core.network.dataproviders.MovieDataProviders
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieDataProviders: MovieDataProviders
): MovieRepository {
    override suspend fun getMovieList(apiKey: String, q: String): List<Movie> {
return movieDataProviders.getMovieList(apiKey, q).toDomainMovieList()
    }


}