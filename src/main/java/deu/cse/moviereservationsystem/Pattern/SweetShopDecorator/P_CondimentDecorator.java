/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn.Popcorn;

/**
 *
 * @author LG
 */
public abstract class P_CondimentDecorator extends Popcorn {

    protected Popcorn popcorn;

    @Override
    public abstract String getDescription();

    @Override
    public abstract int cost();

}
