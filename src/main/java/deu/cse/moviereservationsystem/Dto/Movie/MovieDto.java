/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Dto.Movie;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;

/**
 *
 * @author jaejin
 */
public class MovieDto {

    private String title;
    private String genre;
    private String director;
    private int duration;

    public MovieDto() {
    }

    public MovieDto(MovieBuilder builder) {
        this.title = builder.title;
        this.director = builder.director;
        this.duration = builder.duration;
        this.genre = builder.genre; 
    }

    public MovieDto(String title, String genre, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.genre = genre;
    }

    /**
     * `Movie` 엔티티로부터 `MovieDto` 객체를 생성합니다.
     *
     * @param entity `Movie` 엔티티
     * @return 생성된 `MovieDto` 객체
     */
    /**
     * 정적 빌더 클래스.
     */
    public static class MovieBuilder {

        private String title;
        private String genre;
        private String director;
        private int duration;

        public MovieBuilder() {
        }

        // 빌더의 setter 메소드들. 각 메소드는 빌더 자신을 반환합니다.
        public MovieBuilder title(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder director(String director) {
            this.director = director;
            return this;
        }

        public MovieBuilder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public MovieBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        /**
         * `MovieDto` 객체를 생성하고 반환합니다.
         *
         * @return 생성된 `MovieDto` 객체
         */
        public MovieDto build() {
            return new MovieDto(this);
        }
    }

    /**
     *
     * @param entity
     * @return
     */
    public static MovieDto createDto(Movie entity) {
        return new MovieDto.MovieBuilder()
                .title(entity.getTitle())
                .genre(entity.getGenre())
                .director(entity.getDirector())
                .duration(entity.getDuration())
                .build();
    }
}
