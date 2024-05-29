/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.Movie.ShowSchedule;
import deu.cse.moviereservationsystem.Repository.ShowScheduleRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaejin
 */
public class ScheduleController {

    private static ScheduleController scheduleController = new ScheduleController();

    public static ScheduleController getInstance() {
        return scheduleController;
    }

    private ShowScheduleRepository showScheduleRepository;

    private String[] columnNames = {"제목", "상영관", "상열날짜", "상영 시간(분)"};

    public ScheduleController() {
        this.showScheduleRepository = new ShowScheduleRepository();
    }

    public List<String[]> readScheduletoString() {
        return showScheduleRepository.readAlltoString();
    }

    public boolean addSchedule(String title, String theater, int duration, LocalDateTime dateTime) {
        ShowSchedule item = showScheduleRepository.create(new ShowSchedule(title, theater, dateTime, duration));

        if (Objects.isNull(item)) {
            return false;
        }
        return true;
    }

    public DefaultTableModel updateTable() {
        List<String[]> scheduleData = readScheduletoString();

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        //jTable = new JTable(tableModel);

        for (String[] schedule : scheduleData) {
            tableModel.addRow(schedule);
        }
        
        return tableModel;
    }
    
    public DefaultTableModel updateTable(String title) {
        List<String[]> scheduleData = readScheduletoString();

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        //jTable = new JTable(tableModel);

        for (String[] schedule : scheduleData) {
            if(title.equals(schedule[0])) tableModel.addRow(schedule);
        }
        
        return tableModel;
    }
}
