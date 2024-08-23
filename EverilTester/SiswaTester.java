//object class

import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama SIswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        Siswa Rafly = new Siswa(id, nama, ipk);
        Rafly.print();
             
        // object
        // Class object = new Construction
        Siswa Burhan = new Siswa(26,"Burhan",90);
        Siswa Ibra = new Siswa(29,"Ibra",90);
        Siswa Melvin = new Siswa(21,"Melvin",90);
        Siswa Gilam = new Siswa(19,"Gilam",90);
        Siswa Kinza = new Siswa(15,"Kinza",90);

        // Burhan.print();
        // Ibra.print();
        // Melvin.print();
        // Gilam.print();
        // Kinza.print();
        input.close();
    }
}