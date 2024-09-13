package ProgramPerulangan;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai =0;
        double rata;
        Scanner everil = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa : ");
        jumlahSiswa = everil.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Nilai Siswa "+i+" : ");
            nilai = everil.nextInt();
            totalNilai = totalNilai+nilai;
            
        }
        rata = totalNilai/jumlahSiswa;
        System.out.println("Total Nilai = "+totalNilai);
        System.out.println("Rata-Rata Nilai = "+rata);

        everil.close();
    }
}