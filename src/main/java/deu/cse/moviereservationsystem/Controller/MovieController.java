/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;
import deu.cse.moviereservationsystem.Repository.MovieRepository;
import deu.cse.moviereservationsystem.Repository.ShowScheduleRepository;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class MovieController {
    private static MovieController movieController = new MovieController();
    public static MovieController getInstance() { return movieController;}
    
    private MovieRepository movieRepository;
   
    
    public MovieController() {
        this.movieRepository = new MovieRepository();
    }
    public Movie addMovie(String title, String genre, String director, int duration) {
        List<Movie> movies = movieRepository.readAll();
        
        for(Movie m : movies) {
            if(title.equals(m.getTitle())){
                return null;
            }
        }
        
        Movie movie = movieRepository.create(new Movie(title, genre, director, duration));
        
        //영화 등록 실패 시 null 리턴
        if (Objects.isNull(movie)) return null;
        
        return movie;
    }
    
    public List<String[]> readMovietoString() {
        return movieRepository.readAlltoString();
    }
    
    
}
