package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ArrayList untuk menyimpan data inventaris
        // Data disimpan dalam bentuk array: {nama, stok, satuan, kadaluarsa}
        ArrayList<String[]> inventaris = new ArrayList<>();

        // Tambahkan data awal inventaris
        inventaris.add(new String[]{"Beras", "10", "kg", "2025-12-01"});
        inventaris.add(new String[]{"Minyak Goreng", "5", "liter", "2025-10-15"});
        inventaris.add(new String[]{"Telur", "30", "pcs", "2025-09-20"});
        inventaris.add(new String[]{"Gula Pasir", "8", "kg", "2026-01-05"});
        inventaris.add(new String[]{"Tepung Terigu", "12", "kg", "2025-11-10"});

        int pilihan; // untuk menyimpan menu yang dipilih

        // Perulangan menu utama
        do {
            // Tampilkan menu
            System.out.println("\n===============================");
            System.out.println("       INVENTARIS DAPUR");
            System.out.println("===============================");
            System.out.println("1. Tambah Bahan");
            System.out.println("2. Lihat Inventaris");
            System.out.println("3. Update Bahan");
            System.out.println("4. Hapus Bahan");
            System.out.println("5. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter setelah angka

            // Pilihan menu
            switch (pilihan) {
                case 1:
                    // CREATE (Tambah Bahan)
                    System.out.println("\n--- Tambah Bahan Baru ---");
                    System.out.print("Nama Bahan          : ");
                    String nama = input.nextLine();
                    System.out.print("Jumlah Stok         : ");
                    String stok = input.nextLine();
                    System.out.print("Satuan (kg/liter/pcs): ");
                    String satuan = input.nextLine();
                    System.out.print("Tanggal Kadaluarsa  : ");
                    String kadaluarsa = input.nextLine();

                    String[] bahan = {nama, stok, satuan, kadaluarsa};
                    inventaris.add(bahan);
                    System.out.println("Bahan berhasil ditambahkan!");
                    break;

                case 2:
                    // READ (Lihat Inventaris)
                    System.out.println("\n--- Daftar Inventaris ---");
                    if (inventaris.isEmpty()) {
                        System.out.println("Inventaris masih kosong.");
                    } else {
                        // Header tabel
                        System.out.printf("%-4s %-20s %-10s %-8s %-15s\n",
                                "No", "Nama Bahan", "Stok", "Satuan", "Kadaluarsa");
                        System.out.println("-------------------------------------------------------");

                        // Tampilkan data
                        for (int i = 0; i < inventaris.size(); i++) {
                            String[] b = inventaris.get(i);
                            System.out.printf("%-4d %-20s %-10s %-8s %-15s\n",
                                    (i + 1), b[0], b[1], b[2], b[3]);
                        }
                    }
                    break;

                case 3:
                    // UPDATE (Ubah Bahan)
                    System.out.println("\n--- Update Data Bahan ---");
                    if (inventaris.isEmpty()) {
                        System.out.println("Inventaris masih kosong.");
                    } else {
                        System.out.print("Masukkan nomor bahan yang ingin diupdate: ");
                        int indexUpdate = input.nextInt();
                        input.nextLine();

                        if (indexUpdate > 0 && indexUpdate <= inventaris.size()) {
                            System.out.print("Nama Bahan baru          : ");
                            String newNama = input.nextLine();
                            System.out.print("Jumlah Stok baru         : ");
                            String newStok = input.nextLine();
                            System.out.print("Satuan baru              : ");
                            String newSatuan = input.nextLine();
                            System.out.print("Tanggal Kadaluarsa baru  : ");
                            String newKadaluarsa = input.nextLine();

                            String[] newBahan = {newNama, newStok, newSatuan, newKadaluarsa};
                            inventaris.set(indexUpdate - 1, newBahan);

                            System.out.println("Bahan berhasil diperbarui!");
                        } else {
                            System.out.println("Nomor bahan tidak valid.");
                        }
                    }
                    break;

                case 4:
                    // DELETE (Hapus Bahan)
                    System.out.println("\n--- Hapus Data Bahan ---");
                    if (inventaris.isEmpty()) {
                        System.out.println("Inventaris masih kosong.");
                    } else {
                        System.out.print("Masukkan nomor bahan yang ingin dihapus: ");
                        int indexHapus = input.nextInt();
                        input.nextLine();

                        if (indexHapus > 0 && indexHapus <= inventaris.size()) {
                            inventaris.remove(indexHapus - 1);
                            System.out.println("Bahan berhasil dihapus!");
                        } else {
                            System.out.println("Nomor bahan tidak valid.");
                        }
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
