/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.StatsStrategy;

import deu.cse.moviereservationsystem.Controller.SweetShop.SweeetShopStatsController;
import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import java.util.List;

/**
 *
 * @author LG
 */
public class YearStats implements StatsType {
    SweeetShopStatsController stats = new SweeetShopStatsController();
    @Override
    public int calculateStats(String date) {
        int yearStats = 0;
        List<SweetShop> list = stats.readFile();
        for (Object items : list) {
            SweetShop item = (SweetShop) items;
            String[] parts = item.getDate().split("-");
            if (parts[0].equals(date)) {
                yearStats+=item.getPayment();
            }
        }
        return yearStats;
    }
}
