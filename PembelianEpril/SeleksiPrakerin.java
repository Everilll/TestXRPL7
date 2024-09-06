import java.util.Scanner;

public class SeleksiPrakerin {
    public static void main(String[] args) {
        String nama;
        String kelas;
        String perilaku;
        int nilai;

        Scanner epril = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = epril.nextLine();
        System.out.print("Kelas (X/XI/XII):");
        kelas = epril.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.print("Perilaku Siswa Baik/Cukup: ");
            perilaku = epril.next();
            if(perilaku.equalsIgnoreCase("baik")){
                System.out.print("Nilai Siswa: ");
                nilai = epril.nextInt();
                if(nilai >=85){
                    System.out.println(nama + " Dinyatakan bisa mengikuti prakerin");
                }else{
                    System.out.println("Maaf anda gagal karena nilai");
                }
            }else{
                System.out.println("Maaf anda gagal karena perilaku");
            }
        }else{
            System.out.println("Maaf anda gagal karena bukan kelas XII");
        }
    }
}