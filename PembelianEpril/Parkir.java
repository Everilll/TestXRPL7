import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        String platNomor;
        int jumlahJam;
        double harga;

        Scanner ibra = new Scanner(System.in);
        System.out.print("Masukkan Nomor Plat: ");
        platNomor = ibra.nextLine();
        System.out.print("Jumlah Jam: ");
        jumlahJam = ibra.nextInt();

        if(jumlahJam >0 && jumlahJam <=1){
            harga = 3000;
        }else if(jumlahJam >1 && jumlahJam <=4){
            harga = 7000;
        }else if(jumlahJam >4){
            harga = 10000;
        }else{
            harga = 0;
            System.out.println("System Error");
        }

        System.out.println(platNomor);
        System.out.println("Tarif Parkir "+harga);;
    }
}
