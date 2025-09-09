# PBO_Posttest1


## Deskripsi Program
Program ini adalah aplikasi sederhana berbasis Java yang berfungsi untuk mengelola inventaris bahan dapur. User dapat melakukan operasi CRUD (Create, Read, Update, Delete). Program menyimpan data setiap bahan berupa:
* Nama bahan
* Jumlah stok
* Satuan (kg/liter/pcs)
* Tanggal kadaluarsa (format dd-mm-yyyy)

## Fitur Utama
1. Tambah Bahan -> Menambahkan data baru ke inventaris.
2. Lihat Inventaris -> Menampilkan semua bahan dalam bentuk tabel.
3. Update Bahan -> Mengubah data bahan tertentu berdasarkan nomor urut.
4. Hapus Bahan -> Menghapus bahan dari daftar inventaris.
5. Keluar -> Mengakhiri program.


## 1. **Program Dimulai**

* Program dijalankan -> otomatis masuk ke method main.
* Scanner input dibuat untuk membaca input dari keyboard.
* ArrayList<String[]> inventaris dibuat untuk menyimpan data bahan.
* Data awal langsung dimasukkan ke inventaris (beras, minyak, telur, gula, tepung).

## 2. **Tampilan Menu Utama**

Menu utama:

<img width="344" height="218" alt="Screenshot 2025-09-09 184439" src="https://github.com/user-attachments/assets/b74f2470-e4d0-4944-939a-214fac999348" />

User diminta memilih angka 1–5.

## 3. **Alur Program**

### Menu 1 -> Tambah Bahan (CREATE)

* User mengisi:
  * Nama bahan
  * Jumlah stok
  * Satuan
  * Tanggal kadaluarsa


<img width="349" height="139" alt="image" src="https://github.com/user-attachments/assets/bf5e4245-594e-4f23-9cf7-23bfaee4324b" />


* Output setelah user menambahkan bahan dapur


<img width="535" height="192" alt="image" src="https://github.com/user-attachments/assets/0cf12cf8-2883-44b3-9135-54abbfccef4e" />


### Menu 2 -> Lihat Inventaris (READ)

Pada saat user menginput 2 pada pilihan, maka output:


<img width="531" height="163" alt="image" src="https://github.com/user-attachments/assets/b576ecde-a2a9-4a2b-bcd9-3c1eb3d21cf9" />


Output menampilkan isi dari data inventaris dapur yang tersedia

### Menu 3 -> Update Bahan (UPDATE)

* User diminta untuk memilih nomor bahan yang ingin diubah.
* Jika nomor valid maka user dapat mengisi data baru (nama, stok, satuan, kadaluarsa).

Contoh update bahan:


<img width="353" height="140" alt="image" src="https://github.com/user-attachments/assets/5cfffdac-6790-409a-9138-44e83e2071ce" />


Apabila nomor bahan yang di input tidak valid maka output nya sebagai berikut


<img width="422" height="90" alt="image" src="https://github.com/user-attachments/assets/87c3adb6-2f74-4419-99d4-765a137ea48b" />


### Menu 4 → Hapus Bahan (DELETE)

* User diminta memasukkan nomor bahan yang ingin dihapus.

Contoh output:


<img width="443" height="670" alt="image" src="https://github.com/user-attachments/assets/25609592-e6c4-41e1-9b1c-7c3e3d4e505e" />


### Menu 5 → Keluar

* Output apabila menginput angka 5 yaitu keluar dari program:

  <img width="687" height="374" alt="image" src="https://github.com/user-attachments/assets/4cb3c041-670d-4747-a17d-1714016cede3" />
