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
public class SweetShopController {

    CrudRepository crud;

    public SweetShopController() {
        this.crud = new SweetShopRepository();
    }

    public void createSweetShopFile(SweetShop shop) {
        crud.create(shop);
    }

    public List<SweetShop> pickOrder(String user) {//각 유저별 주문내역을 출력한다.
        /*txt 파일에서 가져온 모든 데이터와 입력받은 user값을 비교하여 같으면 ArrayList로 불러온다.*/
        List<SweetShop> userOrder = new ArrayList<>();
        for (Object items : crud.readAll()) { // crud.readAll()이 리스트를 반환한다고 가정
            SweetShop item = (SweetShop) items;
            if (item.getUser().equals(user)) {
                userOrder.add(item);
            }
        }
        return userOrder;
    }
    public List<String> getDate(List<SweetShop> list){
         List<String> st = new ArrayList<>();
         for(SweetShop l : list){
            st.add(l.getDate());
        }
         return st;
    }
    public List<Integer> getPayment(List<SweetShop> list){
         List<Integer> st = new ArrayList<>();
         for(SweetShop l : list){
            st.add(l.getPayment());
        }
         return st;
    }
    public List<String> getPaymentMethod(List<SweetShop> list){
         List<String> st = new ArrayList<>();
         for(SweetShop l : list){
            st.add(l.getPaymentMethod());
        }
         return st;
    }
    
    /*public void separateOrder(List<SweetShop> list){
        List<String> st = new ArrayList<>();
        String[] menu = null;
        for(SweetShop l : list){
            st.add(l.getOrderList());
        }
        for(String s : st){
            menu = s.split("|");
        }
    }*/
    
}
