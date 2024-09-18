import java.util.Scanner;

public class PembelianAlatTulis {
    public static void main(String[] args) {
        int pilihan, jumlah=0;
        double harga=0, total, temp=0;
        String tambahanbeli;
        do {
        Scanner Everil = new Scanner(System.in);
        System.out.println("List Alat Tulis");
        System.out.println("1.Buku 4000\n2.Pensil 2500\n3.Penghapus 1000\n4. Penggaris 2500");
        System.out.print("Inputkan Pembelian (1/2/3/4): ");
        pilihan = Everil.nextInt();
        System.out.println("Jumlah Beli: ");
        jumlah = Everil.nextInt();

        switch (pilihan) {
            case 1:
                harga = 4000;
                break;

            case 2:
                harga = 2500;
                break;

            case 3:
                harga = 1000;
                break;

            case 4:
                harga = 2500;
                break;
        
            default:
                break;
        }

        total=jumlah*harga;
        temp += total;
        System.out.println("Apakah Beli Lagi (ya/tidak): ");
        tambahanbeli = Everil.next();
    }while(tambahanbeli.equalsIgnoreCase("ya"));

    System.out.println("Total yang dibayarkan: "+temp);
    }
}