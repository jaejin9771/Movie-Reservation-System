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

public List<String> getDate(List<SweetShop> list) {
        List<String> st = new ArrayList<>();
        for (SweetShop l : list) {
            st.add(l.getDate());
        }
        return st;
    }

    public List<Integer> getPayment(List<SweetShop> list) {
        List<Integer> st = new ArrayList<>();
        for (SweetShop l : list) {
            st.add(l.getPayment());
        }
        return st;
    }

    public List<String> getPaymentMethod(List<SweetShop> list) {
        List<String> st = new ArrayList<>();
        for (SweetShop l : list) {
            st.add(l.getPaymentMethod());
        }
        return st;
    }
    
    // 메뉴, 사이즈, 가격을 저장할 리스트 생성
    List<String> menus = new ArrayList<>();
    List<String> sizes = new ArrayList<>();
    List<Integer> costs = new ArrayList<>();

    public void separateOrder(List<SweetShop> list) {
        // SweetShop 객체 리스트에서 orderList 문자열을 추출하여 저장할 리스트 생성
        List<String> st = new ArrayList<>();
        // 각 orderList 문자열을 ';'로 분리하여 처리
        for (SweetShop l : list) {
            st.add(l.getOrderList());
        }
        for (String s : st) {
            String[] items = s.split(";");
            for (String i : items) {
                // 각 아이템을 '|'로 분리하여 메뉴, 사이즈, 가격을 추출
                String[] parts = i.split("\\|");
                // 메뉴, 사이즈, 가격이 모두 있는 경우
                if (parts.length == 3) {
                    menus.add(parts[0]);
                    sizes.add(parts[1]);
                    costs.add(Integer.parseInt(parts[2]));
                }
                /*else if (parts.length == 2) {
                    // 가격 정보가 없는 경우
                    menus.add(parts[0]);
                    sizes.add(parts[1]);
                    costs.add(0); // 가격 정보가 없는 경우 0으로 설정
                }*/
            }
        }
    }

    public List<String> getMenus() {
        return menus;
    }

    public List<String> getSizes() {
        return sizes;
    }

    public List<Integer> getCosts() {
        return costs;
    }

}
