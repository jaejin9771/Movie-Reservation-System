/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage;

/**
 *
 * @author LG
 */
public class Cider extends Beverage {
    public Cider(){
        description = "사이다";
    }
    @Override
    public int cost() {
        return 3000;
    }
}
