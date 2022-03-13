package org.mycompany.dvdstore.service;

import org.mycompany.dvdstore.entity.Movie;
import org.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

    MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
