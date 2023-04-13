/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanPratikum6;

/**
 *
 * @author Administrator
 */

    import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input data mahasiswa
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        String nim = input.nextLine();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        
        input.nextLine(); // membersihkan newline
      
        System.out.print("Asal Sekolah : ");
        String asalSekolah = input.nextLine();
        
       
        MahasiswaBaru mhs = new MahasiswaBaru(nama, nim, umur, asalSekolah);
        System.out.println("");
        System.out.println("");
        System.out.println(" ============================= ");
        System.out.println("|       Data Mahasiswa        | ");
        System.out.println(" ============================= ");
        mhs.cetak();
        System.out.print(" ============================= ");
    }
}


