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
    List<String> menus = new ArrayList<>();
    List<String> sizes = new ArrayList<>();
    List<Integer> costs = new ArrayList<>();
    List<String> dates = new ArrayList<>();
    List<Integer> payments = new ArrayList<>();
    List<String> paymentMethods = new ArrayList<>();
    List<Integer> countOrder = new ArrayList<>();

    public SweetShopController() {
        this.crud = new SweetShopRepository();
    }

    public void createSweetShopFile(SweetShop shop) {
        crud.create(shop);
    }

    public List<SweetShop> pickOrder(String user) {//각 유저별 주문내역을 출력한다.
        List<SweetShop> userOrder = new ArrayList<>();
        for (Object items : crud.readAll()) {
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

    public void separateOrder(List<SweetShop> list) {

        List<String> st = new ArrayList<>();
        for (SweetShop l : list) {
            st.add(l.getOrderList());
        }

        for (String s : st) {
            String[] items = s.split(";");
            for (String i : items) {
                String[] parts = i.split("\\|");
                if (parts.length == 3) {
                    menus.add(parts[0]);
                    sizes.add(parts[1]);
                    costs.add(Integer.valueOf(parts[2]));
                }
            }
            countOrder(items);
        }
    }

    private void countOrder(String[] items) {
        boolean isFirstItem = true;
        for (int j = 0; j < items.length; j++) {
            if (isFirstItem) {
                countOrder.add(1); // First item in the order
                isFirstItem = false;
            } else {
                countOrder.add(0); // Subsequent items in the order
            }
        }
    }

    public void distributeOrder(String user) {
        List<SweetShop> orderList = pickOrder(user);
        separateOrder(orderList);
        
        int rowCount = getCountOrder().size();
        int currentIndex = 0;
        
        List<String> dates = getDate(orderList);
        List<Integer> payments = getPayment(orderList);
        List<String> paymentMethods = getPaymentMethod(orderList);

        String previousDate = "";
        int previousPayment = 0;
        String previousPaymentMethod = "";

        for (int i = 0; i < rowCount; i++) {
            if (countOrder.get(i) == 1) {
                // getCountOrder() 값이 1일 때, 현재 인덱스의 값을 출력하고 다음 값으로 이동합니다.
                this.dates.add(dates.get(currentIndex));
                this.payments.add(payments.get(currentIndex));
                this.paymentMethods.add(paymentMethods.get(currentIndex));
                currentIndex++;
            } else {
                // getCountOrder() 값이 0일 때, 이전에 출력된 값을 유지하고 출력합니다.
                this.dates.add(previousDate);
                this.payments.add(previousPayment);
                this.paymentMethods.add(previousPaymentMethod);
            }

            // 이전에 출력된 값을 저장합니다.
            if (currentIndex > 0) {
                previousDate = dates.get(currentIndex - 1);
                previousPayment = payments.get(currentIndex - 1);
                previousPaymentMethod = paymentMethods.get(currentIndex - 1);
            }
        }
    }

    public List<Integer> getCountOrder() {
        return countOrder;
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

    public List<String> getDates() {
        return dates;
    }

    public List<Integer> getPayments() {
        return payments;
    }

    public List<String> getPaymentMethods() {
        return paymentMethods;
    }
}
