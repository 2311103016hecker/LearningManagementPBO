/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Jadwal {
    String tanggalJadwal;
    String waktuJadwal;
    String deskripsi;

    public Jadwal(String tanggalJadwal, String waktuJadwal, String deskripsi) {
        this.tanggalJadwal = tanggalJadwal;
        this.waktuJadwal = waktuJadwal;
        this.deskripsi = deskripsi;
    }

    public String getTanggalJadwal() {
        return tanggalJadwal;
    }

    public String getWaktuJadwal() {
        return waktuJadwal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setTanggalJadwal(String tanggalJadwal) {
        this.tanggalJadwal = tanggalJadwal;
    }

    public void setWaktuJadwal(String waktuJadwal) {
        this.waktuJadwal = waktuJadwal;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    
}
