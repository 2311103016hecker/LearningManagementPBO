/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearningManagement1;

/**
 *
 * @author hecke
 */
public class Alarm {
    String waktuAlarm;
    String bunyiAlarm;

    public Alarm(String waktuAlarm, String bunyiAlarm) {
        this.waktuAlarm = waktuAlarm;
        this.bunyiAlarm = bunyiAlarm;
    }

    public String getWaktuAlarm() {
        return waktuAlarm;
    }

    public String getBunyiAlarm() {
        return bunyiAlarm;
    }

    public void setWaktuAlarm(String waktuAlarm) {
        this.waktuAlarm = waktuAlarm;
    }

    public void setBunyiAlarm(String bunyiAlarm) {
        this.bunyiAlarm = bunyiAlarm;
    }
    
    
}
