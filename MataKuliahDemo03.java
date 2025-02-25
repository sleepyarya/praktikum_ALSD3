package praktikum_ALSD3;

import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dummy, kode, nama;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = Integer.parseInt(s.nextLine());

        Matakuliah03[] arrayOfMatakuliah = new Matakuliah03[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode            : ");
            kode = s.nextLine();
            System.out.print("Nama            : ");
            nama = s.nextLine();
            System.out.print("Sks             : ");
            dummy = s.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam      : ");
            dummy = s.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            // Inisialisasi objek dalam array
            arrayOfMatakuliah[i] = new Matakuliah03();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        // Menampilkan data yang telah dimasukkan
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Data Matakuliah ke-" + (i + 1));
        // System.out.println("Kode : " + arrayOfMatakuliah[i].kode);
        // System.out.println("Nama : " + arrayOfMatakuliah[i].nama);
        // System.out.println("Sks : " + arrayOfMatakuliah[i].sks);
        // System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
        // System.out.println("----------------------------------");
        // }

    }
}
