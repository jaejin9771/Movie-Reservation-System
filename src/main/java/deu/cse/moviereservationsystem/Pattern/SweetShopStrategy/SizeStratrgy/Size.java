/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.SizeStratrgy;

/**
 *
 * @author LG
 */
public class Size {
    SizeChoice sizeChoice;
    public Size(){};
    public String getSize(){
        return sizeChoice.getSize();
    }
    public int getCost(){
        return sizeChoice.cost();
    }
}
