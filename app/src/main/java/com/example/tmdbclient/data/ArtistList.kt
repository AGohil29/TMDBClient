package com.example.tmdbclient.data


import com.example.tmdbclient.data.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
)