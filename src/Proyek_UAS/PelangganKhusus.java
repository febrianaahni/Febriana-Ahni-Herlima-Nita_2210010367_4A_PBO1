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
// 8. Inheritance
public class PelangganKhusus extends Pelanggan {
    private int diskon;

    public PelangganKhusus(String nama, String kodePelanggan, int jumlahPemakaian, int diskon) { 
// 4. Constructor
        super(nama, kodePelanggan, jumlahPemakaian); // 8. Inheritance
        this.diskon = diskon;
    }

    public int getDiskon() { // 6. Accessor
        return diskon;
    }

    @Override
    public String getNama() { // 9. Polymorphism
        return super.getNama() + " (Khusus)";
    }
}

    

