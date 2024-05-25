/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Repository.UserRepository;

/**
 *
 * @author jaejin
 */
public class UserController {
    private static UserController userController = new UserController();
    public static UserController getInstance() { return userController; }
    
    private UserRepository userRepository;
    
    public UserController() {
        this.userRepository = new UserRepository();
    }
    
    
}
