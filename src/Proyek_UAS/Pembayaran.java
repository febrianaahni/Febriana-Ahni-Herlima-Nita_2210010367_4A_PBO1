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
class Pembayaran {
    private final Pelanggan pelanggan; // 7. Encapsulation
    private String jenisPelanggan;
    private int biayaBeban;
    private int hargaPerM3;
    private int totalHarga;
    private int pajak10Persen;
    private int totalTagihan;

    public Pembayaran(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        hitungTagihan();
    }

    // 10. Seleksi
    private void hitungTagihan() {
        String kodePelanggan = pelanggan.getKodePelanggan();
        int jumlahPemakaian = pelanggan.getJumlahPemakaian();

        switch (kodePelanggan) {
            case "L01":
                jenisPelanggan = "Pabrik";
                biayaBeban = 50000;
                hargaPerM3 = 2500;
                break;
            case "L02":
                jenisPelanggan = "Swalayan";
                biayaBeban = 35000;
                hargaPerM3 = 2000;
                break;
            case "L03":
                jenisPelanggan = "Swalayan";
                biayaBeban = 25000;
                hargaPerM3 = 1500;
                break;
            case "L04":
                jenisPelanggan = "Rumah";
                biayaBeban = 15000;
                hargaPerM3 = 750;
                break;
            default:
                jenisPelanggan = "Ada Kesalahan !";
                biayaBeban = 0;
                hargaPerM3 = 0;
                break;
        }

        totalHarga = hargaPerM3 * jumlahPemakaian + biayaBeban;
        pajak10Persen = 10 * totalHarga / 100;
        totalTagihan = totalHarga + pajak10Persen;
    }

    public void tampilkanTagihan() {
        System.out.println("Jenis Pelanggan\t: " + jenisPelanggan);
        System.out.println("Biaya Beban\t: " + biayaBeban);
        System.out.println("Harga Per M3\t: " + hargaPerM3);
        System.out.println("Total Harga\t: " + totalHarga);
        System.out.println("Pajak 10%\t: " + pajak10Persen);
        System.out.println("Total Tagihan\t: " + totalTagihan);
    }
}

