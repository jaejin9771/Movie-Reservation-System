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
public class RomanceMovie extends Movie{
    public RomanceMovie(String title, String director, int duration) {
        super(title, "Romance", director, duration);
    }
}
