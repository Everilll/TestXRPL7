import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        double total, diskon, potonganharga;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian: ");
        total = input.nextDouble();

        if(total > 100000) {
            potonganharga = 0;
            diskon = 0.1*total;
            total -=diskon;
        }else{
            diskon = 0;
            potonganharga = 5000;
            total -= potonganharga;
        }
        System.out.println("Diskon: "+diskon);
        System.out.println("Potongan Harga: "+potonganharga);
        System.out.println("Total Yang Harus Dibayarkan: "+total);
    }
}