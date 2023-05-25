/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week9;

import java.util.List;

/**
 *
 * @author Administrator
 */


public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void topUpPulsa(double amount);
    double getSisaPulsa();
    void tambahKontak(String nama, String nomor);
    List <String> lihatKontak();
    String cariKontak(String nama);
}
