/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;

/**
 *
 * @author jaejin
 */
public class MovieRepository extends CrudRepository<Movie> {
    
    public MovieRepository() {
        super("movie.txt");
    }
    
    @Override
    protected Movie fromString(String str) {
        // 문자열을 Movie 객체로 변환하는 로직 구현
        String[] parts = str.split(",");
        return new Movie(parts[0], parts[1],parts[2], Integer.parseInt(parts[3]));
    }
    
    @Override
    protected String toString(Movie movie) {
        // Movie 객체를 문자열로 변환하는 로직 구현
        return movie.getTitle() + "," + movie.getGenre() + "," + movie.getDirector() + "," + movie.getDuration();
    }
    
    
}
