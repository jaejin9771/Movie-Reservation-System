/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.PopcornDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.P_CondimentDecorator;

/**
 *
 * @author LG
 */
public class CheeseSeasoning extends P_CondimentDecorator{
    String description = "치즈 시즈닝 추가";
    Items item;
    public CheeseSeasoning(Items item){
        this.item = item;
    }
    @Override
    public String getDescription(){
        return item.getDescription()+" "+description;
    }
    @Override
    public int cost() {
        return item.cost() + 500;
    }
}
