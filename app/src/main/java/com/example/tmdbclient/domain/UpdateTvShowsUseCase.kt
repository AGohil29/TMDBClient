package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.tvshow.TVShow

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TVShow>? = tvShowRepository.updateTvShows()
}