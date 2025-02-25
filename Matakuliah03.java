package praktikum_ALSD3;

import java.util.concurrent.ForkJoinPool;

public class Matakuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah03() {

    }

    public Matakuliah03(String kd, String nm, int sks, int jmlJ) {
        kode = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJ;
    }

    public void tambahData(String kd, String nm, int sks, int jmlJam) {
        kode = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    public void cetakInfo() {

        System.out.println("Kode        :" + kode);
        System.out.println("Nama        :" + nama);
        System.out.println("Sks         :" + sks);
        System.out.println("Jumlah Jam  :" + jumlahJam);
        System.out.println("----------------------------");

    }
}
