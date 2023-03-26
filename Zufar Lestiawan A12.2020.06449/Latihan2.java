/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan04c;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Latihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = input.nextLine();
        System.out.print("Masukkan pemakaian air dalam m3: ");
        double pemakaianAir = input.nextDouble();
        
        double biayaPemakaianAir = 0;
        if (pemakaianAir <= 10) {
            biayaPemakaianAir = pemakaianAir * 1000;
        } else if (pemakaianAir <= 20) {
            biayaPemakaianAir = 10_000 + ((pemakaianAir - 10) * 2000);
        } else {
            biayaPemakaianAir = 30_000 + ((pemakaianAir - 20) * 5000);
        }
        
        System.out.println("");
        System.out.println("Perhitungan Biaya Pemakaian Air");
        System.out.println("=======================================");
        System.out.println("Nama              : " + nama);
        System.out.println("Nomor Pelanggan   : " + nomorPelanggan);
        System.out.println("Pemakaian Air     : " + pemakaianAir + " m3");
        System.out.println("Biaya Pakai       : Rp" + biayaPemakaianAir);
        System.out.println("=======================================");
    }
}  

