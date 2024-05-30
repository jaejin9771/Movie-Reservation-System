/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import deu.cse.moviereservationsystem.Entity.Movie.Ticket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaejin
 */
public class TicketRepository extends CrudRepository<Ticket> {
    
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
    
    public TicketRepository(){
        super("ticket.txt");
    }
    
    @Override
    protected Ticket fromString(String str) {
       String[] parts = str.split(",");
       
       return new Ticket(parts[0],parts[1],parts[2],LocalDateTime.parse(parts[3],formatter),Integer.parseInt(parts[4]),parts[5]);
    }

    @Override
    protected String toString(Ticket item) {
        return item.getId() + "," + item.getTitle() + "," + item.getTheater() + "," + item.getDateTime().toString() + "," + item.getDuration() + "," + item.getSeat();
    }
    
}
