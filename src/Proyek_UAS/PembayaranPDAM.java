/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek_UAS;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class PembayaranPDAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // 12. IO Sederhana
            System.out.println("=============================================");
            System.out.println("Program Pembayaran Tagihan Air PDAM Pelanggan");
            System.out.println("=============================================");
            System.out.print("Masukkan Nama Pelanggan\t\t: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kode Pelanggan\t\t: ");
            String kodePelanggan = input.nextLine();
            System.out.print("Masukkan Jumlah Pemakaian\t: ");
            int jumlahPemakaian = input.nextInt();
            System.out.println("=============================================");

            // 13. Array
            Pelanggan[] pelangganList = new Pelanggan[1];
            pelangganList[0] = new Pelanggan(nama, kodePelanggan, jumlahPemakaian);

            // 11. Perulangan
            for (Pelanggan pelanggan : pelangganList) {
                Pembayaran pembayaran = new Pembayaran(pelanggan);
                pembayaran.tampilkanTagihan();
            }
        } catch (Exception e) { // 14. Error Handling
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

