/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller.SweetShop;

import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import deu.cse.moviereservationsystem.Repository.CrudRepository;
import deu.cse.moviereservationsystem.Repository.SweetShopRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LG
 */
public class SweeetShopStatsController {

    CrudRepository crud;

    List<String> dates = new ArrayList<>();
    List<String> names = new ArrayList<>();
    List<String> paymentMethods = new ArrayList<>();
    List<Integer> payments = new ArrayList<>();
    int countSize;

    public List<String> getDates() {
        return dates;
    }

    public List<String> getName() {
        return names;
    }

    public List<String> getPaymentMethod() {
        return paymentMethods;
    }

    public List<Integer> getPayment() {
        return payments;
    }

    public int getCountSize() {
        return countSize;
    }

    public SweeetShopStatsController() {
        this.crud = new SweetShopRepository();
        setVariable();
        countSize = readFile().size();
    }

    public List<SweetShop> readFile() {
        List<SweetShop> list = new ArrayList<>();
        for (Object object : crud.readAll()) {
            SweetShop shop = (SweetShop) object;
            list.add(shop);
        }
        return list;
    }

    public void separateOrder(List<SweetShop> list) {
        //하나의 문자열로 결합된 주문내역을 menu, size,cost 별로 나눈다.
        List<String> st = new ArrayList<>();
        for (SweetShop l : list) {
            st.add(l.getDate());
        }
        for (String s : st) {
            String[] items = s.split(",");
            this.dates.add(s);
        }
    }

    private void setVariable() {
        List<SweetShop> sweetShops = readFile();
        for (SweetShop shop : sweetShops) {
            dates.add(shop.getDate());
            names.add(shop.getUser());
            paymentMethods.add(shop.getPaymentMethod());
            payments.add(shop.getPayment());
        }
    }
}
