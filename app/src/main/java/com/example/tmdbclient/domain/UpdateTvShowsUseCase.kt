package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.tvshow.TVShow

class UpdateTvShowsUseCase(private val tvShowInterface: TvShowInterface) {

    suspend fun execute(): List<TVShow>? = tvShowInterface.updateTvShows()
}