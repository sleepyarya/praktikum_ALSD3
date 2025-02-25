package praktikum_ALSD3;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mahasiswa03[] arrayOfMahasiswa = new Mahasiswa03[3];
        String dummy;

        for (int i = 0; i < 3; i++) {

            arrayOfMahasiswa[i] = new Mahasiswa03();

            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            System.out.print("NIM          : ");
            arrayOfMahasiswa[i].nim = s.nextLine();
            System.out.print("Nama         : ");
            arrayOfMahasiswa[i].nama = s.nextLine();
            System.out.print("Kelas        : ");
            arrayOfMahasiswa[i].kelas = s.nextLine();
            System.out.print("IPK          : ");
            dummy = s.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------------");

        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Data Mahasiswa ke-" + (j + 1));
            System.out.println("NIM           : " + arrayOfMahasiswa[j].nim);
            System.out.println("Nama          : " + arrayOfMahasiswa[j].nama);
            System.out.println("Kelas         : " + arrayOfMahasiswa[j].kelas);
            System.out.println("IPK           : " + arrayOfMahasiswa[j].ipk);
            System.out.println("-----------------------------------------");
        }
    }
}
