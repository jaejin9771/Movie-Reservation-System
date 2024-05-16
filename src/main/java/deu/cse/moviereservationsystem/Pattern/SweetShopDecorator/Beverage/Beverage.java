/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;

/**
 *
 * @author LG
 */
public abstract class Beverage  implements Items {
    String description = "선택음료 없음";
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public abstract int cost();
}
