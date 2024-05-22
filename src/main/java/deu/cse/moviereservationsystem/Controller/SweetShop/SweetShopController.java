/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller.SweetShop;

import deu.cse.moviereservationsystem.Entity.SweetShopEntity.SweetShop;
import deu.cse.moviereservationsystem.Repository.CrudRepository;
import deu.cse.moviereservationsystem.Repository.SweetShopRepository;

/**
 *
 * @author LG
 */
public class SweetShopController {
    CrudRepository crud;
    public SweetShopController(){
        this.crud = new SweetShopRepository();
    }
    public void createSweetShopFile(SweetShop shop){
        crud.create(shop);
    }
}
