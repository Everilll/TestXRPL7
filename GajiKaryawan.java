import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        double tarifperjam, jamkerja, potonganpajak, gajitotal;

        Scanner input = new Scanner(System.in);
        System.out.println("Gaji Kotor Karyawan (Rp): ");
        tarifperjam = input.nextDouble();
        System.out.println("Jam Kerja :");
        jamkerja = input.nextDouble();
        potonganpajak = 10;

        gajitotal=tarifperjam*jamkerja;
        potonganpajak=(potonganpajak/100)*gajitotal;
        gajitotal=gajitotal-potonganpajak;

        System.out.println("Gaji Bersih = Rp. "+gajitotal);

    }
}