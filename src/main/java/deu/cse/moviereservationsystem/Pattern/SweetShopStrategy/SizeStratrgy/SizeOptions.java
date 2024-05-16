/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopStrategy.SizeStratrgy;

/**
 *
 * @author LG
 */
public class SizeOptions extends Size {
    public SizeOptions(String selectedSize){
        if(selectedSize=="S"){
            sizeChoice = new SizeS();
        }else if(selectedSize=="M"){
            sizeChoice = new SizeM();
        }
        else if(selectedSize=="L"){
            sizeChoice = new SizeL();
        }
    }
}
