package com.example.tmdbclient.data.model.tvshow


import com.example.tmdbclient.data.model.tvshow.TVShow
import com.google.gson.annotations.SerializedName

data class TVShowList(
    @SerializedName("results")
    val TVShows: List<TVShow>
)