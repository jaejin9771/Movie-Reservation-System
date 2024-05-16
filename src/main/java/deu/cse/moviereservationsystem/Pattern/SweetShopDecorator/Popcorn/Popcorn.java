/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Items;

/**
 *
 * @author LG
 */
public abstract class Popcorn  implements Items {
    String description="선택팝콘 없음";

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public abstract int cost();
}
