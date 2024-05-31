/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;
import deu.cse.moviereservationsystem.Entity.Movie.Movie.MovieBuilder;
import deu.cse.moviereservationsystem.Repository.MovieRepository;
import deu.cse.moviereservationsystem.Repository.ShowScheduleRepository;
import java.util.List;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaejin
 */
public class MovieController {

    private static MovieController movieController = new MovieController();

    public static MovieController getInstance() {
        return movieController;
    }

    private MovieRepository movieRepository;

    String[] columnNames = {"제목", "장르", "감독", "상영 시간(분)"};

    public MovieController() {
        this.movieRepository = new MovieRepository();
    }

    public Movie addMovie(String title, String genre, String director, int duration) {
        List<Movie> movies = movieRepository.readAll();

        for (Movie m : movies) {
            if (title.equals(m.getTitle())) {
                return null;
            }
        }

        Movie movie = movieRepository.create(new MovieBuilder()
                .title(title)
                .genre(genre)
                .director(director)
                .duration(duration)
                .build());

        //영화 등록 실패 시 null 리턴
        if (Objects.isNull(movie)) {
            return null;
        }

        return movie;
    }

    public List<String[]> readMovietoString() {
        return movieRepository.readAlltoString();
    }

    public DefaultTableModel updateTable() {
        List<String[]> movieData = readMovietoString();

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };
        //jTable = new JTable(tableModel);

        for (String[] movie : movieData) {
            tableModel.addRow(movie);
        }

        return tableModel;
    }

    public void delete(String title, String genre, String director, String duration) {
        movieRepository.delete(new Movie(title, genre, director, Integer.parseInt(duration)));
    }
}
