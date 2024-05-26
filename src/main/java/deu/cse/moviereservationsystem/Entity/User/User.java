/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Entity.User;

import deu.cse.moviereservationsystem.Entity.Movie.Movie;
import java.util.Objects;

/**
 *
 * @author jaejin
 */
public class User {
    
    protected String name;
    protected String id;
    protected String pw;
    
    public User() {
    }
    
    public User(String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }
    
    public User(UserBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.pw = builder.pw;
    }
    @Override
    public boolean equals(Object obj) {
        // 같은 참조인지 확인
        if (this == obj) {
            return true;
        }

        // obj가 null이거나 클래스 타입이 다른 경우 false 반환
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 형 변환 후, 필드별로 비교
        User user = (User) obj;
        return Objects.equals(name, user.name)
                && Objects.equals(id, user.id)
                && Objects.equals(pw, user.pw);
    }
    
    @Override
    public int hashCode() {
        // Objects.hash를 사용하여 필드를 기반으로 해시 코드 생성
        return Objects.hash(name, id, pw);
    }
    
    public static class UserBuilder {
        
        private String name;
        private String id;
        private String pw;
        
        public UserBuilder name(String name){
            this.name=name;
            return this;
        }
        
        public UserBuilder id(String id) {
            this.id =id;
            return this;
        }
        
        public UserBuilder pw(String pw){
            this.pw = pw;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
    
    
}
