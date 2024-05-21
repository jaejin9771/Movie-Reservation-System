/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Entity.SweetShopEntity;

/**
 *
 * @author LG
 */
public class SweetShop {
    private String user;
    private String orderList;
    private String date;
    private String paymentMethod;
    private int payment;

    public SweetShop(String user,String orderList, String date, String paymentMethod, int payment) {
        this.user = user;
        this.orderList = orderList;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.payment = payment;
    }

    public static class SweetShopBuilder {

        private String user;
        private String orderList;
        private String date;
        private String paymentMethod;
        private int payment;

        public SweetShopBuilder user(String user) {
            this.user = user;
            return this;
        }

        public SweetShopBuilder orderList(String orderList){
            this.orderList = orderList;
            return this;
        }

        public SweetShopBuilder date(String date) {
            this.date = date;
            return this;
        }

        public SweetShopBuilder PaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        
        public SweetShopBuilder Payment (int payment){
            this.payment = payment;
            return this;
        }

        public SweetShop build() {
            return new SweetShop(user,orderList, date, paymentMethod, payment);
        }
    }

    public String toString() {
        return "고객 = '" + user + '\''
                +  "주문내역 = '" + orderList + '\''
                + "날짜 = '" + date + '\'' 
                + "결제수단 = '" + paymentMethod + '\''
                + "가격 = '" + payment + '\'';
    }

    public String getUser() {
        return user;
    }

    public String getOrderList() {
        return orderList;
    }

    public String getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getPayment() {
        return payment;
    }
}
