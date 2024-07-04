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
    //class
    class Pelanggan {
    private final String nama;
    private final String kodePelanggan;
    private final int jumlahPemakaian;

    //constructor
    public Pelanggan(String nama, String kodePelanggan, int jumlahPemakaian) {
        this.nama = nama;
        this.kodePelanggan = kodePelanggan;
        this.jumlahPemakaian = jumlahPemakaian;
    }
    //Accessor
    public String getNama() {
        return nama;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public int getJumlahPemakaian() {
        return jumlahPemakaian;
    }
}
    

