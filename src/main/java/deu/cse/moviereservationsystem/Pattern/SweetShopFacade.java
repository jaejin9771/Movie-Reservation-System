/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern;

import deu.cse.moviereservationsystem.Pattern.SweetShopObserver.OrderList;
import deu.cse.moviereservationsystem.view.SweetShop.BeverageFrame;
import deu.cse.moviereservationsystem.view.SweetShop.PopcornFrame;
import deu.cse.moviereservationsystem.view.SweetShop.ShoppingCartFrame;
import deu.cse.moviereservationsystem.view.SweetShop.SweetShopFrame;

/**
 *
 * @author LG
 */
public class SweetShopFacade {
     OrderList orderList = OrderList.getInstance();
    BeverageFrame beverage = BeverageFrame.getInstance();
    ShoppingCartFrame shopping = ShoppingCartFrame.getInstance();
    PopcornFrame popcorn = PopcornFrame.getInstance();
    SweetShopFrame frame = SweetShopFrame.getInstance();
    
    public void onObserver(){
        beverage.setOrder(orderList); //OrderFrame 옵저버 등록
        shopping.setOrder(orderList);
        popcorn.setOrder(orderList);
        frame.setOrder(orderList);
    }
    public void offObserver(){
        orderList.removeObserver(shopping); //옵저버 삭제(구독 알림 x)
        orderList.removeObserver(beverage); //옵저버 삭제(구독 알림 x)
        orderList.removeObserver(popcorn); //옵저버 삭제(구독 알림 x)
        orderList.removeObserver(frame);
    }
    
}
