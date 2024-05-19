/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.DTO;

/**
 *
 * @author LG
 */
public class ShoppingCartDTO {

    private Object menu;
    private Object size;
    private Object cost;

    private ShoppingCartDTO(Object menu, Object size, Object cost) {
        this.menu = menu;
        this.size = size;
        this.cost = cost;
    }

    public static class ShoppingCartBuilder {

        private Object menu;
        private Object size;
        private Object cost;


        public ShoppingCartBuilder menu(Object menu) {
            this.menu = menu;
            return this;
        }

        public ShoppingCartBuilder size(Object size) {
            this.size = size;
            return this;
        }

        public ShoppingCartBuilder cost(Object cost) {
            this.cost = cost;
            return this;
        }

        public ShoppingCartDTO build() {
            return new ShoppingCartDTO(menu, size, cost);
        }
    }

    public String toString() {
        return "메뉴 = '" + menu + '\'' +
               ", 사이즈 = '" + size + '\'' +
               ", 가격 = '" + cost + '\'';
    }
    public Object getCost() {
            return cost;
        }
}
