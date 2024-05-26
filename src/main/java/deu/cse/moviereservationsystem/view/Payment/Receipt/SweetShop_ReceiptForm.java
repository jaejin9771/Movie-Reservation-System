/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.view.Payment.Receipt;

import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LG
 */
public class SweetShop_ReceiptForm {

    SweetShop shop;

    List<String> menus = new ArrayList<>();
    List<String> sizes = new ArrayList<>();
    List<Integer> costs = new ArrayList<>();

    public SweetShop_ReceiptForm(SweetShop shop) {
        this.shop = shop;
        splitOrder();
    }

    private void splitOrder() {
        String orderList = shop.getOrderList();
        String[] items = orderList.split(";");
        for (String i : items) {
            String[] parts = i.split("\\|");
            if (parts.length == 3) {
                menus.add(parts[0]);
                sizes.add(parts[1]);
                costs.add(Integer.valueOf(parts[2]));
            }
        }
    }

    public StringBuilder setTextArea() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("주문날짜: %s\n", shop.getDate()));
        builder.append("-------------------------------------------------------------------------------\n");
        builder.append(String.format("%-30s \t%-30s \t  %-15s\n", "메뉴", "사이즈", "가격"));
        builder.append("-------------------------------------------------------------------------------\n");
        for (int i = 0; i < menus.size(); i++) {
            String menu = menus.get(i);
            String size = sizes.get(i);
            String cost = String.valueOf(costs.get(i));

            while (menu.length() > 20) {
                // 메뉴 이름을 25자로 자르고 줄바꿈
                builder.append(String.format("%-25s %-30s %-15s\n", menu.substring(0, 20), size, cost));
                // 남은 문자열로 메뉴 이름 업데이트
                menu = menu.substring(20);
                // 사이즈와 비용은 첫 줄에만 출력되므로 빈 문자열로 설정
                size = "";
                cost = "";
            }

            // 남은 메뉴 이름 출력 (길이가 25 이하인 경우)
            builder.append(String.format("%-25s %-30s %-15s\n", menu, size, cost));
        }
        builder.append("-------------------------------------------------------------------------------\n");
        builder.append(String.format("총 가격: %d\n", shop.getPayment()));
        builder.append(String.format("결제수단: %s\n", shop.getPaymentMethod()));
        return builder;
    }

}
