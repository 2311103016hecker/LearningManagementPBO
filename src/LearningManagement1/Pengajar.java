/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Pengajar {
    int usiaPeng;
  String detailUserPeng;
  String alamatPeng;
  String namaInstitusiPeng;
  String nomerTelPeng;

    public Pengajar(int usiaPeng, String detailUserPeng, String alamatPeng, String namaInstitusiPeng, String nomerTelPeng) {
        this.usiaPeng = usiaPeng;
        this.detailUserPeng = detailUserPeng;
        this.alamatPeng = alamatPeng;
        this.namaInstitusiPeng = namaInstitusiPeng;
        this.nomerTelPeng = nomerTelPeng;
    }

    public int getUsiaPeng() {
        return usiaPeng;
    }

    public String getDetailUserPeng() {
        return detailUserPeng;
    }

    public String getAlamatPeng() {
        return alamatPeng;
    }

    public String getNamaInstitusiPeng() {
        return namaInstitusiPeng;
    }

    public String getNomerTelPeng() {
        return nomerTelPeng;
    }

    public void setUsiaPeng(int usiaPeng) {
        this.usiaPeng = usiaPeng;
    }

    public void setDetailUserPeng(String detailUserPeng) {
        this.detailUserPeng = detailUserPeng;
    }

    public void setAlamatPeng(String alamatPeng) {
        this.alamatPeng = alamatPeng;
    }

    public void setNamaInstitusiPeng(String namaInstitusiPeng) {
        this.namaInstitusiPeng = namaInstitusiPeng;
    }

    public void setNomerTelPeng(String nomerTelPeng) {
        this.nomerTelPeng = nomerTelPeng;
    }
  
    
}
