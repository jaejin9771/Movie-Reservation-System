/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller.SweetShop;

import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShopPayment;
import deu.cse.moviereservationsystem.Repository.CrudRepository;
import deu.cse.moviereservationsystem.Repository.SweetShopRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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
    List<String> payments = new ArrayList<>();
    List<String> paymentMethods = new ArrayList<>();
    List<Integer> countOrder = new ArrayList<>();

    public SweetShopController() {
        this.crud = new SweetShopRepository();
    }

    public void createSweetShopFile(SweetShop shop) {
        crud.create(shop);
    }

    public List<SweetShop> readUserOrder(String user) {//각 유저별 주문내역을 출력한다.
        List<SweetShop> userOrder = new ArrayList<>();
        for (Object items : crud.readAll()) {
            SweetShop item = (SweetShop) items;
            if (item.getUser().equals(user)) {
                userOrder.add(item);
            }
        }
        return userOrder;
    }
// -----------------------------------------------------------------------------------

    public <T> List<T> getList(List<SweetShop> list, Function<SweetShop, T> mapper) {
        //Function<T, R>은 제네릭 인터페이스로, 'T' 타입의 입력을 받아 R타입의 출력을 반환
        //'apply' 메서드는 입력 값을 받아 반환
        List<T> result = new ArrayList<>();
        for (SweetShop l : list) {
            result.add(mapper.apply(l));
        }
        return result;
    }

    public List<String> getDate(List<SweetShop> list) {
        return getList(list, SweetShop -> SweetShop.getDate());
    }

    public List<String> getPayment(List<SweetShop> list) {
        return getList(list, SweetShop -> String.valueOf(SweetShop.getPayment()));
    }

    public List<String> getPaymentMethod(List<SweetShop> list) {
        return getList(list, SweetShop -> SweetShop.getPaymentMethod());
    }
// -----------------------------------------------------------------------------------

    public void separateOrder(List<SweetShop> list) {
        //하나의 문자열로 결합된 주문내역을 menu, size,cost 별로 나눈다.
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
        //주문내역에서 첫번째로 담긴 메뉴일 경우 1을 넣어주고 아닌 경우엔 0을 넣는다.
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
        //countOrder(String[] items)메서드에서 카운트한 변수를 이용하여 
        //date, payment, paymentMethod의 인덱스길이를 menu, size, cost만큼 늘린다.
        List<SweetShop> orderList = readUserOrder(user); //데이터파일에서 user가 주문한 내역을 List로 불러온다.
        separateOrder(orderList);

        int currentIndex = 0;

        List<String> dates = getDate(orderList);//user가 주문한 내역의 날짜를 불러온다.
        List<String> payments = getPayment(orderList);//user가 주문한 내역의 총 가격을 불러온다.
        List<String> paymentMethods = getPaymentMethod(orderList);//user가 주문한 내역의 결제수단을 불러온다.

        for (int i = 0; i < getCountOrder().size(); i++) {
            if (countOrder.get(i) == 1) {
                // getCountOrder() 값이 1일 때, 현재 인덱스의 값을 출력하고 다음 값으로 이동합니다.
                this.dates.add(dates.get(currentIndex));
                this.payments.add(payments.get(currentIndex));
                this.paymentMethods.add(paymentMethods.get(currentIndex));
                currentIndex++;
            } else {
                // getCountOrder() 값이 0일 때, 이전에 출력된 값을 유지하고 출력합니다.
                this.dates.add(" ");
                this.payments.add(" ");
                this.paymentMethods.add(" ");
            }
        }
    }

    public SweetShopPayment updatePayEntity() {
        SweetShopPayment payEntity = new SweetShopPayment(this.menus, this.sizes, this.costs, this.dates, this.payments, this.paymentMethods);
        return payEntity;
    }

    public List<Integer> getCountOrder() {
        return countOrder;
    }
}
