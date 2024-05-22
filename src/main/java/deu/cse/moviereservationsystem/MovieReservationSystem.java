/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package deu.cse.moviereservationsystem;

import deu.cse.moviereservationsystem.Controller.SweetShop.SweetShopController;
import deu.cse.moviereservationsystem.view.MainFrame;

/**
 *
 * @author LG
 */
public class MovieReservationSystem {

    public static void main(String[] args) {
        MainFrame main = new MainFrame();
        main.setVisible(true);
        
        SweetShopController c = new SweetShopController();
        //c.separateOrder(c.pickOrder("이지민"));
    }
}
