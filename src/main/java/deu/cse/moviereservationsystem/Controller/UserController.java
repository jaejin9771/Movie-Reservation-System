/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Controller;

import deu.cse.moviereservationsystem.Entity.User.User;
import deu.cse.moviereservationsystem.Repository.UserRepository;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class UserController {

    private static UserController userController = new UserController();
    private String id;
    
    public static UserController getInstance() {
        return userController;
    }

    private UserRepository userRepository;

    public UserController() {
        this.userRepository = new UserRepository();
    }

    public User Login(String id, String pw) {

        User user = findById(id);
        
        if (Objects.isNull(user)) {
            System.out.println("Failed Login.");
                return null;
            }
        if (pw.equals(user.getPw())) {
            this.id=id;
            System.out.println("Success Login!");
            return user;
        }
        System.out.println("Wrong Password.");
        return null;        
    }

    public User signUp(String name, String id, String pw) {

        User user = findById(id);

        if (Objects.isNull(user)) {
            user = userRepository.create(new User(name, id, pw));
            if (Objects.isNull(user)) {
                return null;
            }
        } else {
            return null;
        }
        
        return user;
    }

    public User findById(String id) {

        List<User> userList = userRepository.readAll();

        for (User u : userList) {
            if (id.equals(u.getId())) { // 이미 존재하는 id 인지 확인
                return u;               // 존재 하면 User 객체 반환
            }
        }
        return null;                    // 존재하지 않으면 null 반환
    }

    public String getId() {
        return id;
    }
}
