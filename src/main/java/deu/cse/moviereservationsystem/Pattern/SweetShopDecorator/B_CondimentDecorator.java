/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator;

import deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Beverage.Beverage;

/**
 *
 * @author LG
 */
public abstract class B_CondimentDecorator extends Beverage {
    protected Beverage beverage;
    @Override
    public abstract String getDescription();
    @Override
    public abstract int cost();
}
