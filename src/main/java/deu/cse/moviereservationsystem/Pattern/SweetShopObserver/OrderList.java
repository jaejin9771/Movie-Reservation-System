/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopObserver;

import java.util.LinkedList;

/**
 *
 * @author LG
 */
public class OrderList extends Subject{
    private static final OrderList instance = new OrderList();

    private String menu;
    private String size;
    private int cost;
    private int countOrder;

    private OrderList() {
        observers = new LinkedList<>();
    }

    public static OrderList getInstance() {
        return instance;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void deliverObserver() {
        for (Observer observer : observers) {
            observer.updateObserver(menu, size, cost, countOrder);
        }
    }

    public void receiveOrderList(String menu, String size, int cost) {
        this.menu = menu;
        this.size = size;
        this.cost = cost;

        countingOrder(menu, size, cost);
        deliverObserver();
    }

    public void countingOrder(String menu, String size, int cost) {
        if ("".equals(menu) && "".equals(size) && cost == 0) {
            this.countOrder = 0;
        } else {
            this.countOrder++;
        }
    }
}
