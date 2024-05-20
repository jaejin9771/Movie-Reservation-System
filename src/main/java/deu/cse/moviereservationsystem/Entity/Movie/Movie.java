/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Entity.Movie;

import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class Movie {
    protected String title;
    protected String director;
    protected int duration;

    public Movie() {
    }

    public Movie(Builder builder) {
        this.title = builder.title;
        this.director = builder.director;
        this.duration = builder.duration;
    }

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        // 같은 참조인지 확인
        if (this == obj) {
            return true;
        }

        // obj가 null이거나 클래스 타입이 다른 경우 false 반환
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 형 변환 후, 필드별로 비교
        Movie movie = (Movie) obj;
        return duration == movie.duration
                && Objects.equals(title, movie.title)
                && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        // Objects.hash를 사용하여 필드를 기반으로 해시 코드 생성
        return Objects.hash(title, director, duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static class Builder {

        private String title;
        private String director;
        private int duration;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder director(String director) {
            this.director = director;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
