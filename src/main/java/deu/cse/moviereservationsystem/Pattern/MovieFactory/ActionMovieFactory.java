/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.MovieFactory;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;

/**
 *
 * @author jaejin
 */
public class ActionMovieFactory implements MovieFactory{
    @Override
    public Movie createMovie(String title, String director, int duration) {
        return new ActionMovie(title, director, duration);
    }
}
