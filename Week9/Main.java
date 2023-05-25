/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

/**
 *
 * @author Administrator
 */
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hpnokia phone = new Hpnokia();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        boolean powerOn = false; // Menyimpan status power on/off

        System.out.println("======== Menu ========");
        System.out.println("1. Power On");
        System.out.println("2. Exit");
        System.out.print("Pilih menu: ");
        int initialChoice = scanner.nextInt();

        switch (initialChoice) {
            case 1:
                phone.powerOn();
                powerOn = true;
                break;
            case 2:
                running = false;
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak valid.");
                break;
        }

        while (running) {
            System.out.println("======== Menu ========");
            System.out.println("1. Power Off");
            System.out.println("2. Volume Up");
            System.out.println("3. Volume Down");
            System.out.println("4. Top Up Pulsa");
            System.out.println("5. Sisa Pulsa");
            System.out.println("6. Tambah Kontak");
            System.out.println("7. Lihat Kontak");
            System.out.println("8. Cari Kontak");
            System.out.println("9. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (powerOn) {
                        phone.powerOff();
                        powerOn = false;
                    } else {
                        System.out.println("Handphone sudah dalam keadaan mati.");
                    }
                    break;
                case 2:
                    if (powerOn) {
                        phone.volumeUp();
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 3:
                    if (powerOn) {
                        phone.volumeDown();
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 4:
                    if (powerOn) {
                        System.out.print("Masukkan jumlah pulsa yang ingin diisi: ");
                        double amount = scanner.nextDouble();
                        phone.topUpPulsa(amount);
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 5:
                    if (powerOn) {
                        double sisaPulsa = phone.getSisaPulsa();
                        System.out.println("Sisa pulsa: " + sisaPulsa);
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 6:
                    if (powerOn) {
                        System.out.print("Masukkan nama kontak: ");
                        String nama = scanner.next();
                        System.out.print("Masukkan nomor kontak: ");
                        String nomor = scanner.next();
                        phone.tambahKontak(nama, nomor);
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 7:
                    if (powerOn) {
                        List<String> daftarKontak = phone.lihatKontak();
                        if (daftarKontak.isEmpty()) {
                            System.out.println("Kontak kosong.");
                        } else {
                            System.out.println("Daftar Kontak:");
                            for (String kontak : daftarKontak) {
                                System.out.println(kontak);
                            }
                        }
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 8:
                    if (powerOn) {
                        System.out.print("Masukkan nama kontak yang ingin dicari: ");
                        String namaCari = scanner.next();
                        String hasilCari = phone.cariKontak(namaCari);
                        System.out.println(hasilCari);
                    } else {
                        System.out.println("Handphone harus dalam keadaan menyala.");
                    }
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
