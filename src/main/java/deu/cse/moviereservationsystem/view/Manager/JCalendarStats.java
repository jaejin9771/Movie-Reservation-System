/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.view.Manager;

import deu.cse.moviereservationsystem.Controller.SweetShop.SweeetShopStatsController;
import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import java.util.List;

/**
 *
 * @author LG
 */
public class JCalendarStats {

    SweeetShopStatsController stats = new SweeetShopStatsController();

    public int calculateDayStats(String date) {
        int dateStats = 0;
        List<SweetShop> list = stats.readFile();
        for (Object items : list) {
            SweetShop item = (SweetShop) items;
            if (item.getDate().equals(date)) {
                dateStats += item.getPayment();
            }
        }
        return dateStats;
    }

    public int calculateMonthStats(String month) {
        int monthStats = 0;
        List<SweetShop> list = stats.readFile();
        for (Object items : list) {
            SweetShop item = (SweetShop) items;
            String[] parts = item.getDate().split("-");
            if (parts[1].equals(month)) {
                monthStats+=item.getPayment();
            }
        }
        return monthStats;
    }

    public int calculateYearStats(String year) {
        int yearStats = 0;
        List<SweetShop> list = stats.readFile();
        for (Object items : list) {
            SweetShop item = (SweetShop) items;
            String[] parts = item.getDate().split("-");
            if (parts[0].equals(year)) {
                yearStats+=item.getPayment();
            }
        }
        return yearStats;
    }
}
