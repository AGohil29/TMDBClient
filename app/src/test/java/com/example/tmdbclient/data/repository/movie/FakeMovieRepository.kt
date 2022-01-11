package com.example.tmdbclient.data.repository.movie

import com.example.tmdbclient.data.model.movie.Movie
import com.example.tmdbclient.domain.MovieRepository

class FakeMovieRepository: MovieRepository {
    private val movies = mutableListOf<Movie>()

    init {
        movies.add(Movie(1, "overview", "path1", "date1", "title1"))
        movies.add(Movie(2, "overview", "path2", "date2", "title2"))
    }

    override suspend fun getMovies(): List<Movie>? {
        return movies
    }

    override suspend fun updateMovies(): List<Movie>? {
        movies.clear()
        movies.add(Movie(3, "overview", "path3", "date3", "title3"))
        movies.add(Movie(4, "overview", "path4", "date4", "title4"))
        return movies
    }
}