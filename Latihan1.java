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
public class Latihan1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, programStudi, nilaiHuruf;
        int nilai;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan program studi: ");
        programStudi = input.nextLine();

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 70 && nilai < 85) {
            nilaiHuruf = "B";
        } else if (nilai >= 60 && nilai < 70) {
            nilaiHuruf = "C";
        } else if (nilai >= 50 && nilai < 60) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("");
        System.out.println("Data Test");
        System.out.println("==========================");
        System.out.println("Nama           : " + nama);
        System.out.println("Program studi  : " + programStudi);
        System.out.println("Nilai          : " + nilai);
        System.out.println("Nilai huruf    : " + nilaiHuruf);
        System.out.println("==========================");
    }
}
  

