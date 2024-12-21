/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Pelajar {
  int usiaPel;
  String detailUser;
  String alamat;
  String namaInstitusiPel;
  String nomerTelPel;

    public Pelajar(int usiaPel, String detailUser, String alamat, String namaInstitusiPel, String nomerTelPel) {
        this.usiaPel = usiaPel;
        this.detailUser = detailUser;
        this.alamat = alamat;
        this.namaInstitusiPel = namaInstitusiPel;
        this.nomerTelPel = nomerTelPel;
    }

    public int getUsiaPel() {
        return usiaPel;
    }

    public String getDetailUser() {
        return detailUser;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNamaInstitusiPel() {
        return namaInstitusiPel;
    }

    public String getNomerTelPel() {
        return nomerTelPel;
    }

    public void setUsiaPel(int usiaPel) {
        this.usiaPel = usiaPel;
    }

    public void setDetailUser(String detailUser) {
        this.detailUser = detailUser;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNamaInstitusiPel(String namaInstitusiPel) {
        this.namaInstitusiPel = namaInstitusiPel;
    }

    public void setNomerTelPel(String nomerTelPel) {
        this.nomerTelPel = nomerTelPel;
    }
  
    
}
