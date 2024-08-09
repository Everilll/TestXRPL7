//object class
public class SiswaTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Siswa Burhan = new Siswa();
        Siswa Ibra = new Siswa();
        Siswa Melvin = new Siswa();
        Siswa Gilam = new Siswa();
        Siswa Kinza = new Siswa();

        Burhan.id = 26;
        Burhan.nama = "Burhan";
        Burhan.ipk = 90;

        Ibra.id = 29;
        Ibra.nama = "Ibra";
        Ibra.ipk = 90;

        Melvin.id = 21;
        Melvin.nama = "Melvin";
        Melvin.ipk = 90;

        Gilam.id = 19;
        Gilam.nama = "Gilam";
        Gilam.ipk = 90;

        Kinza.id = 15;
        Kinza.nama = "Kinza";
        Kinza.ipk = 90;

        System.out.println("ID : " + Burhan.id);
        System.out.println("Nama : " + Burhan.nama);
        System.out.println("IPK : " + Burhan.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Ibra.id);
        System.out.println("Nama : " + Ibra.nama);
        System.out.println("IPK : " + Ibra.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Melvin.id);
        System.out.println("Nama : " + Melvin.nama);
        System.out.println("IPK : " + Melvin.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Gilam.id);
        System.out.println("Nama : " + Gilam.nama);
        System.out.println("IPK : " + Gilam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Kinza.id);
        System.out.println("Nama : " + Kinza.nama);
        System.out.println("IPK : " + Kinza.ipk);
    }
}