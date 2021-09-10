package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.artist.Artist

interface ArtistInterface {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}