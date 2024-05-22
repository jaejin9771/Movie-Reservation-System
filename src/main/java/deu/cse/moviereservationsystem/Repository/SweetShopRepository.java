/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import java.time.LocalDate;

/**
 *
 * @author LG
 */
public class SweetShopRepository extends CrudRepository<SweetShop> {

    public SweetShopRepository() {
        super("sweetShop.txt");
    }

    @Override
    protected SweetShop fromString(String str) {
        String[] parts = str.split(",");
        LocalDate date = LocalDate.parse(parts[2]);

        return new SweetShop(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]));
    }

    @Override
    protected String toString(SweetShop shop) {
        return shop.getUser() + "," + shop.getOrderList() + "," + shop.getDate() + "," + shop.getPaymentMethod() + "," + shop.getPayment();
    }
}
