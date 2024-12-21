/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Login {
    String username;
    String password;
    String jenisUser;

    public Login(String username, String password, String jenisUser) {
        this.username = username;
        this.password = password;
        this.jenisUser = jenisUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJenisUser() {
        return jenisUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJenisUser(String jenisUser) {
        this.jenisUser = jenisUser;
    }
    
    
}
