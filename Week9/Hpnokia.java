/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Hpnokia implements Phone {
    private int volume;
    private double pulsa;
    private Map<String, String> kontak;

    public Hpnokia() {
        this.volume = 0;
        this.pulsa = 0.0;
        this.kontak = new HashMap<>();
    }

    @Override
    public void powerOn() {
        System.out.println("Handphone ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Handphone OFF");
    }

    @Override
    public void volumeUp() {
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        }
        System.out.println("Volume sekarang: " + this.volume);
    }

    @Override
    public void volumeDown() {
        if (this.volume > MIN_VOLUME) {
            this.volume--;
        }
        System.out.println("Volume sekarang: " + this.volume);
    }

    @Override
    public void topUpPulsa(double amount) {
        this.pulsa += amount;
        System.out.println("Pulsa berhasil diisi. Sisa pulsa sekarang: " + this.pulsa);
    }

    @Override
    public double getSisaPulsa() {
        return this.pulsa;
    }

    @Override
    public void tambahKontak(String nama, String nomor) {
        this.kontak.put(nama, nomor);
        System.out.println("Kontak berhasil ditambahkan.");
    }

    @Override
    public List<String> lihatKontak() {
        List<String> daftarKontak = new ArrayList<>();
        for (Map.Entry<String, String> entry : kontak.entrySet()) {
            String kontakStr = entry.getKey() + ": " + entry.getValue();
            daftarKontak.add(kontakStr);
        }
        return daftarKontak;
    }

    @Override
    public String cariKontak(String nama) {
        if (kontak.containsKey(nama)) {
            return "Nomor kontak " + nama + ": " + kontak.get(nama);
        }
        return "Kontak tidak ditemukan.";
    }

    public int getVolume() {
        return this.volume;
    }
}