/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Entity.SweetShopEntity;

import java.util.List;

/**
 *
 * @author LG
 */
public class SweetShopPayment {

    private final List<String> menus;
    private final List<String> sizes;
    private final List<Integer> costs;
    private final List<String> dates;
    private final List<String> payments;
    private final List<String> paymentMethods;

    public SweetShopPayment(List<String> menus, List<String> sizes, List<Integer> costs, List<String> dates, List<String> payments, List<String> paymentMethods) {
        this.menus = menus;
        this.sizes = sizes;
        this.costs = costs;
        this.dates = dates;
        this.payments = payments;
        this.paymentMethods = paymentMethods;
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

    public List<String> getPayments() {
        return payments;
    }

    public List<String> getPaymentMethods() {
        return paymentMethods;
    }
}
