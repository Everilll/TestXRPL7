//object class

import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Karyawan:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Karyawan:");
        int id = input.nextInt();
        System.out.println("Inputkan Unit:");
        String unit = input.nextLine();
        System.out.println("Inputkan Alamat:");
        String alamat = input.nextLine();
        // object
        // Class object = new Construction
        Karyawan Burhan = new Karyawan(26,"Burhan","TU","TulungAgung");
        Karyawan Ibra = new Karyawan(29,"Ibra","Kesiswaan","Lamongan");
        Karyawan Melvin = new Karyawan(21,"Melvin","TU","Malang");
        Karyawan Gilam = new Karyawan(19,"Gilam","Kesiswaan","Papua");
        Karyawan Kinza = new Karyawan(15,"Kinza","Kurikulum","Sidoarjo");

        Burhan.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        Melvin.print();
        System.out.println();
        Gilam.print();
        System.out.println();
        Kinza.print();
    }
}