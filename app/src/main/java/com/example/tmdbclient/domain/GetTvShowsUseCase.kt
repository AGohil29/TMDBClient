package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.tvshow.TVShow

class GetTvShowsUseCase(private val tvShowInterface: TvShowInterface) {

    suspend fun execute(): List<TVShow>? = tvShowInterface.getTvShows()
}