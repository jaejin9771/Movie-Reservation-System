/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.SizeStratrgy;

/**
 *
 * @author LG
 */
public class SizeS implements SizeChoice {
    String size = "S";
    @Override
    public String getSize() {
        return size;
    }
    
    @Override
    public int cost() {
        return 0;
    }
}
