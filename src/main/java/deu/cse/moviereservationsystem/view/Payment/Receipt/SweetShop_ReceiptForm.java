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
    String startLine = "-------------------------- 영수증 출력 -------------------------";
    String endLine = "------------------------------------------------------------------";
    String title = "메뉴\t 사이즈\t 가격";
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
        builder.append(startLine).append("\n"); // 줄바꿈 추가
        builder.append(title).append("\n"); // 줄바꿈 추가
        for (int i = 0; i < menus.size(); i++) {
            builder.append(String.format("%-20s %-10s %10d\n", menus.get(i), sizes.get(i), costs.get(i)));
        }
        builder.append(endLine).append("\n"); // 줄바꿈 추가
        builder.append(shop.getPayment()).append("\n"); // 줄바꿈 추가
        builder.append(shop.getPaymentMethod()).append("\n"); // 줄바꿈 추가
        return builder;
    }
}
