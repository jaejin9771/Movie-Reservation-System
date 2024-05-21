/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.DTO.SweetShop;

/**
 *
 * @author LG
 */
public class ShoppingCartDTO {

     private String menu;
    private String size;
    private int cost;

    private ShoppingCartDTO(String menu, String size, int cost) {
        this.menu = menu;
        this.size = size;
        this.cost = cost;
    }

    public static class ShoppingCartBuilder {

        private String menu;
        private String size;
        private int cost;


        public ShoppingCartBuilder menu(String menu) {
            this.menu = menu;
            return this;
        }

        public ShoppingCartBuilder size(String size) {
            this.size = size;
            return this;
        }

        public ShoppingCartBuilder cost(int cost) {
            this.cost = cost;
            return this;
        }

        public ShoppingCartDTO build() {
            return new ShoppingCartDTO(menu, size, cost);
        }
    }

    public String toString() {
        return "메뉴 = '" + menu + '\'' +
               "사이즈 = '" + size + '\'' +
               "가격 = '" + cost ;
    }
    
    public int getCost() {
            return cost;
        }
}
