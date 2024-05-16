/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn;

/**
 *
 * @author LG
 */
public class CaramelPopcorn extends Popcorn {
    public CaramelPopcorn(){
        description = "카라멜 팝콘";
    }
    public String getDescription(){
        return description;
    }
    @Override
    public int cost() {
        return 6000;
    }
    
}
