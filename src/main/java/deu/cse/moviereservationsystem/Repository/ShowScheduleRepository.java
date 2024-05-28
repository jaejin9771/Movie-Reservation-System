/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import deu.cse.moviereservationsystem.Entity.Movie.ShowSchedule;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaejin
 */
public class ShowScheduleRepository extends CrudRepository<ShowSchedule>{
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public ShowScheduleRepository() {
        super("showschedule.txt");
    }
    
    @Override
    protected ShowSchedule fromString(String str) {
        String[] parts = str.split(",");
        
        return new ShowSchedule(parts[0],parts[1],LocalDateTime.parse(parts[2], formatter));
    }
    
    @Override
    protected String toString(ShowSchedule showSchedule){
        return showSchedule.getTitle() + "," + showSchedule.getTheater() + "," + showSchedule.getShowTime();
    }
}
