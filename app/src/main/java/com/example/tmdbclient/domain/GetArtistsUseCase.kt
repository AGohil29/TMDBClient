package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.artist.Artist

class GetArtistsUseCase(private val artistInterface: ArtistInterface) {

    suspend fun execute(): List<Artist>? = artistInterface.getArtists()
}