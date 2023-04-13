/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPratikum6;

/**
 *
 * @author Administrator
 */

    public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    public MahasiswaBaru(String nama, String nim, int umur, String asalSekolah) {
        super(nama, nim, umur);
        this.asalSekolah = asalSekolah;
    }
    
    @Override
    public void cetak() {
        System.out.println("NIM : " + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUmur());
        System.out.println("Asal Sekolah : " + asalSekolah);
    }
}
