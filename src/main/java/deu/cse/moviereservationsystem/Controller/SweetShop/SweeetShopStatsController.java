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
    int countSize = readFile().size();
    
    public SweeetShopStatsController(){
        this.crud =  new SweetShopRepository(); 
        setVariable();
    }
    private List<SweetShop> readFile(){
        List<SweetShop> list = new ArrayList<>();
        for(Object object : crud.readAll()){
            SweetShop shop = (SweetShop) object;
            list.add(shop);
        }
        return list;
    }
    private void setVariable(){
        for(int i=0; i<readFile().size(); i++){
            dates.add(readFile().get(i).getDate());
            names.add(readFile().get(i).getUser());
            paymentMethods.add(readFile().get(i).getPaymentMethod());
            payments.add(readFile().get(i).getPayment());
        }
    }

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
    public int getCountSize(){
        return countSize;
    }
}
