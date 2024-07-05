# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Pembayaran PDAM menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, kode pelanggan, dan jumlah pemakaian air. Aplikasi kemudian menghitung dan menampilkan informasi detail tagihan PDAM, termasuk biaya beban, harga per m3, total harga, pajak 10%, dan total tagihan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pelanggan`, `Pembayaran`, `PelangganKhusus` dan `PembayaranPDAM` adalah contoh dari class.

```bash
public class Pelanggan {
    ...
}

public class Pembayaran {
    ...
}

public class PelangganKhusus extends Pelanggan {
    ...
}

public class PembayaranPDAM {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini,  `pelangganList[0] = new Pelanggan(nama, kodePelanggan, jumlahPemakaian);` adalah contoh pembuatan object.
```bash
pelangganList[0] = new Pelanggan(nama, kodePelanggan, jumlahPemakaian);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`kodePelanggan` dan `jumlahPemakaian` adalah contoh atribut.

```bash
private String nama;
private String kodePelanggan;
private int jumlahPemakaian;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pelanggan` dan `Pembayaran`.

```bash
public Pelanggan(String nama, String kodePelanggan, int jumlahPemakaian) {
    this.nama = nama;
    this.kodePelanggan = kodePelanggan;
    this.jumlahPemakaian = jumlahPemakaian;
}

public Pembayaran(Pelanggan pelanggan) {
    this.pelanggan = pelanggan;
    hitungTagihan();
}```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setJumlahPemakaian` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKodePelanggan(String kodePelanggan) {
    this.kodePelanggan = kodePelanggan;
}

public void setJumlahPemakaian(int jumlahPemakaian) {
    this.jumlahPemakaian = jumlahPemakaian;
}    
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKodePelanggan` dan `getJumlahPemakaian` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKodePelanggan() {
    return kodePelanggan;
}

public int getJumlahPemakaian() {
    return jumlahPemakaian;
}```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,`kodePelanggan` dan `jumlahPemakaian` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kodePelanggan;
private int jumlahPemakaian;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PelangganKhusus` mewarisi `Pelanggan` dengan sintaks `extends`.

```bash
public class PelangganKhusus extends Pelanggan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo` di `PelangganKhusus` merupakan overloading method `tampilkanInfoInfo` di `Pembayaran` merupakan override dari method `displayInfo` di `Pelanggan`.

```bash
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Kategori Khusus: " + kategoriKhusus);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `hitungTagihan` untuk menentukan biaya beban dan harga per m3 berdasarkan kode pelanggan.

```bash
private void hitungTagihan() {
    switch (pelanggan.getKodePelanggan()) {
        case "L01":
            biayaBeban = 50000;
            hargaPerM3 = 2500;
            break;
        case "L02":
            biayaBeban = 35000;
            hargaPerM3 = 2000;
            break;
        case "L03":
            biayaBeban = 25000;
            hargaPerM3 = 1500;
            break;
        case "L04":
            biayaBeban = 15000;
            hargaPerM3 = 750;
            break;
        default:
            biayaBeban = 0;
            hargaPerM3 = 0;
            break;
    }
    totalHarga = hargaPerM3 * pelanggan.getJumlahPemakaian() + biayaBeban;
    pajak10Persen = totalHarga / 10;
    totalTagihan = totalHarga + pajak10Persen;
}```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta menampilkan tagihan pelanggan.

```bash
for (Pelanggan pelanggan : pelangganList) {
    Pembayaran pembayaran = new Pembayaran(pelanggan);
    pembayaran.tampilkanTagihan();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.println("=============================================");
System.out.println("Program Pembayaran Tagihan Air PDAM Pelanggan");
System.out.println("=============================================");
System.out.print("Masukkan Nama Pelanggan: ");
String nama = input.next();
System.out.print("Masukkan Kode Pelanggan: ");
String kodePelanggan = input.next();
System.out.print("Masukkan Jumlah Pemakaian: ");
int jumlahPemakaian = input.nextInt();
System.out.println("=============================================");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Pelanggan[] PelangganList = new Pelanggan[2];` adalah contoh penggunaan array.

```bash
Pelanggan[] pelangganList = new Pelanggan[1];
pelangganList[0] = new Pelanggan(nama, kodePelanggan, jumlahPemakaian);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
} finally {
    input.close();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Febriana Ahni Herlima Nita 
NPM: 2210010367
