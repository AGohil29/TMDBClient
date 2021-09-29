package com.example.tmdbclient.data.repository.tvShow.datasourceImpl

import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.model.tvshow.TVShowList
import com.example.tmdbclient.data.repository.tvShow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDatasource {
    override suspend fun getTvShows(): Response<TVShowList> = tmdbService.getPopularTvShows(apiKey)
}