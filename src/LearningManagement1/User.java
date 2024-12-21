/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class User {
    String nama;
    String profesi;

    public User(String nama, String profesi) {
        this.nama = nama;
        this.profesi = profesi;
    }

    public String getNama() {
        return nama;
    }

    public String getProfesi() {
        return profesi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }
    
    
}
