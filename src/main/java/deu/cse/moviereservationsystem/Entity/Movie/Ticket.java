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
public class Ticket {
    private String id;
    private String title;
    private String theater;
    private LocalDateTime dateTime;
    private int duration;
    private String seat;
    
    public Ticket() {
    }

    public Ticket(String id, String title, String theater, LocalDateTime dateTime, int duration, String seat) {
        this.id = id;
        this.title = title;
        this.theater = theater;
        this.dateTime = dateTime;
        this.duration = duration;
        this.seat = seat;
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
        Ticket ticket = (Ticket) obj;
        return Objects.equals(id, ticket.id)
                && Objects.equals(title, ticket.title)
                && Objects.equals(theater, ticket.theater)
                && dateTime.isEqual(ticket.dateTime)
                && Objects.equals(seat, ticket.seat)
                && Objects.equals(duration, ticket.duration);
    }

    @Override
    public int hashCode() {
        // Objects.hash를 사용하여 필드를 기반으로 해시 코드 생성
        return Objects.hash(id, title, theater, dateTime,duration,seat);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    
}
