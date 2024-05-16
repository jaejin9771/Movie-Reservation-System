/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.PopcornDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;
import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.Popcorn;

/**
 *
 * @author LG
 */
public class ChiliSeasoning extends Popcorn{
    String description = "칠리 시즈닝 추가";
    Items popcorn;
    public ChiliSeasoning(Items popcorn){
        this.popcorn = popcorn;
    }
    public String getDescription(){
        return popcorn.getDescription()+" "+description;
    }
    @Override
    public int cost() {
        return popcorn.cost() + 500;
    }
}
