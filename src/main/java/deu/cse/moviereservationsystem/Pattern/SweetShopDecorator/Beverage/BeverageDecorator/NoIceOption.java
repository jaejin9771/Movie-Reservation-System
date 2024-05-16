/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage.BeverageDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage.Beverage;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;

/**
 *
 * @author LG
 */
public class NoIceOption extends Beverage{
    String description = "얼음 없음";
    Items beverage;
    public NoIceOption(Items beverage){
        this.beverage = beverage;
        
    }
    public String getDescription() {
        return beverage.getDescription()+" + "+description;
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
