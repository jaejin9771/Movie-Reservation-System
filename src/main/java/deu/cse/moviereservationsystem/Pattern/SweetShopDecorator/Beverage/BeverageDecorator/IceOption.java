/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage.BeverageDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.B_CondimentDecorator;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;

/**
 *
 * @author LG
 */
public class IceOption extends B_CondimentDecorator{
    String description = "얼음 추가";
    Items beverage;
    public IceOption(Items beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" + "+description;
    }
    @Override
    public int cost() {
        return beverage.cost();
    }
}
