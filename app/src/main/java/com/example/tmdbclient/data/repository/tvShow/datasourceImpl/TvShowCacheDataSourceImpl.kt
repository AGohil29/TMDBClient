package com.example.tmdbclient.data.repository.tvShow.datasourceImpl

import com.example.tmdbclient.data.model.tvshow.TVShow
import com.example.tmdbclient.data.repository.tvShow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {
    private var tvShowsList = ArrayList<TVShow>()

    override suspend fun getTvShowsFromCache(): List<TVShow> {
        return tvShowsList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TVShow>) {
        tvShowsList.clear()
        tvShowsList = ArrayList(tvShows)
    }
}