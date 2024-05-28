/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;
import deu.cse.moviereservationsystem.Repository.MovieRepository;
import deu.cse.moviereservationsystem.Repository.ShowScheduleRepository;
import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class MovieController {
    private static MovieController movieController = new MovieController();
    public static MovieController getInstance() { return movieController;}
    
    private MovieRepository movieRepository;
    private ShowScheduleRepository showScheduleRepository;
    
    public MovieController() {
        this.movieRepository = new MovieRepository();
    }
    public Movie addMovie(String title, String genre, String director, int duration) {
        Movie dto = new Movie(title, genre, director, duration);
        
        Movie movie = movieRepository.create(dto);
        
        //영화 등록 실패 시 null 리턴
        if (Objects.isNull(movie)) return null;
        
        return movie;
    }
}
