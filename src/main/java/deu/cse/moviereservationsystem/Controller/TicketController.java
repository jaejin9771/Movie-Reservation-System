/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.Movie.Ticket;
import deu.cse.moviereservationsystem.Repository.TicketRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaejin
 */
public class TicketController {
    private static TicketController ticketController = new TicketController();
    UserController userController = UserController.getInstance();
    public static TicketController getInstance() {
        return ticketController;
    }
    private final String[] columnNames = {"아이디", "제목", "상영관", "날짜","상영시간(분)","좌석번호"};
    private TicketRepository ticketRepository;
    
    public TicketController() {
        this.ticketRepository = new TicketRepository();
    }
    
    public String[] findNoEmptySeat() {
        List<Ticket> tickets = ticketRepository.readAll();
        List<String> result = new ArrayList<>();
        
        for(Ticket ticket : tickets) {
            result.add(ticket.getSeat());
        }
        
        return result.toArray(new String[0]);
    }
    
    public boolean pay(String id,String title, String theater,LocalDateTime dateTime,int duration,String[] seats) {
        for(String seat : seats) {
            Ticket ticket = ticketRepository.create(new Ticket(id,title,theater,dateTime,duration,seat));
            if(Objects.isNull(ticket)){
                System.out.println("Ticketing error!");
                return false;
            }
        }
        return true;
    }
    
    public List<String[]> readTickettoString() {
        return ticketRepository.readAlltoString();
    }
    
     public DefaultTableModel updateTable() {
        List<String[]> ticketData = readTickettoString();

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // All cells are not editable
            }
        };
        //jTable = new JTable(tableModel);

        for (String[] ticket : ticketData) {
            if (userController.getId().equals(ticket[0])) {
                tableModel.addRow(ticket);
            }
        }

        return tableModel;
    }
    
    public void cancelTicket(String id,String title,String theater,LocalDateTime dateTime ,int duration,String seat){
        ticketRepository.delete(new Ticket(id,title,theater,dateTime,duration,seat));
    }
}
