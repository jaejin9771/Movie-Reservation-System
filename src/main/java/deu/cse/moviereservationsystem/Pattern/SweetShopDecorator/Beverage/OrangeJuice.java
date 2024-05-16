/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage;

/**
 *
 * @author LG
 */
public class OrangeJuice extends Beverage{
    public OrangeJuice(){
        description = "오렌지주스";
    }
    @Override
    public int cost() {
        return 4500;
    }
}
