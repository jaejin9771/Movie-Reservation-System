/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import deu.cse.moviereservationsystem.Entity.User.User;

/**
 *
 * @author jaejin
 */
public class UserRepository extends CrudRepository<User> {
    
    public UserRepository() {
        super("user.txt");
    }

    @Override
    protected User fromString(String str) {
        String[] parts = str.split(",");
        return new User(parts[0],parts[1],parts[2]);
    }

    @Override
    protected String toString(User user) {
        return user.getName() + "," + user.getId() + "," + user.getPw();
    }
    
    
}
