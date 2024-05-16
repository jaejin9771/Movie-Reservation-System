/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Pattern.SweetShopObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LG
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    public abstract void addObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void deliverObserver();
}
