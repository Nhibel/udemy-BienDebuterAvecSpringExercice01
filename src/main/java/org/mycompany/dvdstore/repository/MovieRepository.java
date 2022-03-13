package org.mycompany.dvdstore.repository;

import org.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" of genre " + movie.getGenre() + " has been added.");
    }
}
