/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Entity.Movie;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class ShowSchedule {
    private String title;
    private String theater;
    private LocalDateTime dateTime;
    private int duration;

    public ShowSchedule(String title, String theater, LocalDateTime showTime, int duration) {
        this.title = title;
        this.theater = theater;
        this.dateTime = showTime;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public LocalDateTime getShowTime() {
        return dateTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.dateTime = showTime;
    }
    
    public int getDuration() {
        return duration;
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
        ShowSchedule ss = (ShowSchedule) obj;
        return Objects.equals(title, ss.title)
                && Objects.equals(theater, ss.theater)
                && dateTime.isEqual(ss.dateTime)
                && duration == ss.duration;
    }
    
    @Override
    public int hashCode() {
        // Objects.hash를 사용하여 필드를 기반으로 해시 코드 생성
        return Objects.hash(title, theater, dateTime,duration);
    }
    
    
}
