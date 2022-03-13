package org.mycompany.dvdstore;

import org.mycompany.dvdstore.entity.Movie;
import org.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Please fill in the name, then the genre of the dvd :");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
