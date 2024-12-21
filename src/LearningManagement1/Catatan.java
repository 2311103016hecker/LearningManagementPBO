/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Catatan {
    String judul;
    String isi;
    String tanggalCatatan;

    public Catatan(String judul, String isi, String tanggalCatatan) {
        this.judul = judul;
        this.isi = isi;
        this.tanggalCatatan = tanggalCatatan;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }

    public String getTanggalCatatan() {
        return tanggalCatatan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setTanggalCatatan(String tanggalCatatan) {
        this.tanggalCatatan = tanggalCatatan;
    }
    
    
}
