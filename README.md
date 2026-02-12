# Latihan1_Pemrograman Lanjut

Deskripsi

Program ini merupakan implementasi konsep Object-Oriented Programming (OOP) dalam Java untuk menghitung luas beberapa bangun datar.
Struktur program terdiri dari satu kelas induk (BidangDuaDimensi) dan dua kelas turunan (BujurSangkar dan Lingkaran). Setiap kelas ditempatkan pada file terpisah.

Konsep OOP yang Digunakan
1. Inheritance (Pewarisan)
Kelas BujurSangkar dan Lingkaran merupakan turunan dari kelas BidangDuaDimensi.

```public class BujurSangkar extends BidangDuaDimensi```

2. Method Overriding
Method luas() dideklarasikan pada kelas induk dan dioverride pada masing-masing kelas turunan sesuai dengan rumus luasnya.
```
@Override
public void luas()
```
3. Encapsulation
Atribut seperti sisi, jari_jari, dan luas dibuat private untuk menjaga akses langsung dari luar kelas.
Penjelasan Kelas:

1. BidangDuaDimensi
Kelas induk yang memiliki:
- Atribut nama
- Method info()
- Method luas() (akan dioverride oleh subclass)
Berfungsi sebagai kerangka dasar untuk bangun dua dimensi.

2. BujurSangkar
Memiliki:
- Atribut sisi
- Method luas() untuk menghitung luas dengan rumus:
```  luas = sisi × sisi```

3. Lingkaran
Memiliki:
- Atribut jari_jari(r)
- Method luas() untuk menghitung luas dengan rumus:
```  luas = π × r x r```
Menggunakan konstanta Math.PI dari Java.

Contoh Output
```
Nama bidang : persegi 1
Luas bujur sangkar : 400.0
Nama bidang : lingkaran 1
Luas lingkaran : 153.93804002589985```
