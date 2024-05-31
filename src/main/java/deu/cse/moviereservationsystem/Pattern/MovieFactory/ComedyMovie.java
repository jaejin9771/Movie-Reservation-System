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
public class ComedyMovie extends Movie{
    public ComedyMovie(String title, String director, int duration) {
        super(title, "Comedy", director, duration);
    }
}
