/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPratikum6;

/**
 *
 * @author Administrator
 */
public class Mahasiswa {
   private String nama;
   private String nim;
   private int umur;
   
   public Mahasiswa(String nama, String nim, int umur) {
       this.nama = nama;
       this.nim = nim;
       this.umur = umur;
   }
   
   public String getNama() {
       return nama;
   }
   
   public String getNim() {
       return nim;
   }
   
   public int getUmur() {
       return umur;
   } 

   public void setNama(String nama) {
       this.nama = nama;
   }
   
   public void setNim(String nim) {
       this.nim = nim;
   }
   
   public void setUmur(int umur) {
       this.umur = umur;
   }
   
   public void cetak() {
       System.out.println("NIM : " + nim);
       System.out.println("Nama : " + nama);
       System.out.println("Umur : " + umur);
   }
}
