# PBO_Posttest1

## 1. **Program Dimulai**

* Program dijalankan → otomatis masuk ke method `main`.
* `Scanner input` dibuat untuk membaca input dari keyboard.
* `ArrayList<String[]> inventaris` dibuat untuk menyimpan data bahan.
* **Data awal** langsung dimasukkan ke inventaris (beras, minyak, telur, gula, tepung).

```java
ArrayList<String[]> inventaris = new ArrayList<>();
inventaris.add(new String[]{"Beras", "10", "kg", "2025-12-01"});

## 2. **Tampilkan Menu Utama**

Program menampilkan menu:

<img width="344" height="218" alt="Screenshot 2025-09-09 184439" src="https://github.com/user-attachments/assets/b74f2470-e4d0-4944-939a-214fac999348" />



* User diminta memilih angka **1–5**.
* Input disimpan di variabel `pilihan`.

```java
pilihan = input.nextInt();
input.nextLine(); // untuk buang enter
```

---

## 3. **Proses Pemilihan Menu (Switch Case)**

### 🔹 Menu 1 → Tambah Bahan (CREATE)

* User diminta mengisi:

  * Nama bahan
  * Jumlah stok
  * Satuan
  * Tanggal kadaluarsa
* Data dimasukkan ke inventaris dengan `inventaris.add(bahan);`.

Output:

```
--- Tambah Bahan Baru ---
Nama Bahan          : Garam
Jumlah Stok         : 3
Satuan (kg/liter/pcs): kg
Tanggal Kadaluarsa  : 2025-12-30
Bahan berhasil ditambahkan!
```

---

### 🔹 Menu 2 → Lihat Inventaris (READ)

* Program mengecek apakah inventaris kosong:

  * Jika kosong → tampil "Inventaris masih kosong."
  * Jika ada → data ditampilkan dalam bentuk tabel (`printf`).

Contoh output:

```
--- Daftar Inventaris ---
No   Nama Bahan           Stok       Satuan   Kadaluarsa
-------------------------------------------------------
1    Beras                10         kg       2025-12-01
2    Minyak Goreng        5          liter    2025-10-15
3    Telur                30         pcs      2025-09-20
4    Gula Pasir           8          kg       2026-01-05
5    Tepung Terigu        12         kg       2025-11-10
```

---

### 🔹 Menu 3 → Update Bahan (UPDATE)

* User diminta memasukkan **nomor bahan** yang ingin diubah.
* Jika nomor valid → user isi data baru (nama, stok, satuan, kadaluarsa).
* Data lama diganti dengan `inventaris.set(index-1, newBahan);`.

Contoh:

```
Masukkan nomor bahan yang ingin diupdate: 2
Nama Bahan baru          : Minyak Kelapa
Jumlah Stok baru         : 7
Satuan baru              : liter
Tanggal Kadaluarsa baru  : 2025-11-20
Bahan berhasil diperbarui!
```

---

### 🔹 Menu 4 → Hapus Bahan (DELETE)

* User diminta memasukkan **nomor bahan** yang ingin dihapus.
* Jika valid → data dihapus dengan `inventaris.remove(index-1);`.

Contoh:

```
Masukkan nomor bahan yang ingin dihapus: 3
Bahan berhasil dihapus!
```

---

### 🔹 Menu 5 → Keluar

* Program menampilkan pesan:

```
Terima kasih! Program selesai.
```

* Perulangan berhenti → program berakhir.

---

## 4. **Perulangan (do-while)**

Selama user belum memilih menu **5 (Keluar)**, program akan:

* Menampilkan menu lagi
* Menunggu input user
* Menjalankan perintah sesuai pilihan

```java
} while (pilihan != 5);
```

---

## 🔁 Ringkasan Alur

1. Program mulai → buat inventaris → isi dengan 5 data awal.
2. Tampilkan menu utama.
3. User pilih menu:

   * (1) Tambah → input data baru → simpan ke inventaris.
   * (2) Lihat → tampilkan seluruh inventaris.
   * (3) Update → pilih nomor bahan → ganti data lama dengan baru.
   * (4) Hapus → pilih nomor bahan → hapus dari inventaris.
   * (5) Keluar → akhiri program.
4. Ulangi sampai user pilih keluar.

---

Mau saya buatkan **diagram alur (flowchart)** untuk lebih memudahkan mahasiswa semester 3 memahami alur program ini?
