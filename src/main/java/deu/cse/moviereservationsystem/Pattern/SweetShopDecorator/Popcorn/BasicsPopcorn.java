/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopDecorator.Popcorn;

/**
 *
 * @author LG
 */
public class BasicsPopcorn extends Popcorn{
    public BasicsPopcorn(){
        description = "베이직 팝콘";
    }
    public String getDescription() {
        return description;
    }
    
    @Override
    public int cost() {
        return 5000;
    }
}
