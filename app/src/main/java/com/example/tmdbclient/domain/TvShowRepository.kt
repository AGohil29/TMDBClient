package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.tvshow.TVShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TVShow>?
    suspend fun updateTvShows(): List<TVShow>?
}