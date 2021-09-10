package com.example.tmdbclient.domain

import com.example.tmdbclient.data.model.artist.Artist

class UpdateArtistsUseCase(private val artistInterface: ArtistInterface) {

    suspend fun execute(): List<Artist>? = artistInterface.updateArtists()
}