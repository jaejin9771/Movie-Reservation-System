/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.MovieFactory;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;

/**
 *
 * @author jaejin
 */
public interface MovieFactory {
    Movie createMovie(String title, String director, int duration);
}
