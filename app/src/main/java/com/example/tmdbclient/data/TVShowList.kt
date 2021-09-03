package com.example.tmdbclient.data


import com.example.tmdbclient.data.TVShow
import com.google.gson.annotations.SerializedName

data class TVShowList(
    @SerializedName("results")
    val TVShows: List<TVShow>
)