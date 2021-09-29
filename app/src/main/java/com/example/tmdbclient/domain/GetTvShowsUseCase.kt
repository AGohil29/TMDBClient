package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.tvshow.TVShow

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TVShow>? = tvShowRepository.getTvShows()
}