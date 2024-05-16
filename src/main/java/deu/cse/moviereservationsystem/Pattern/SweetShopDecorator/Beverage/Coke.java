/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage;

/**
 *
 * @author LG
 */
public class Coke extends Beverage{
    public Coke(){
        description = "코카콜라";
    }
    
    @Override
    public int cost() {
        return 3000;
    }
    
}
