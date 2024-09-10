//subclass

public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;


    public CD() {
        number = 10;
        name = "CD Kita Ke Sana";
        Quantity = 100;
        price = 200000.0;
        artist = "Ibra";
        totalSong = 50;
        label = "Lamongan Boys";
    }


    public void print() {
        System.out.println("Number = "+ number);
        System.out.println("Nama = "+ name);
        System.out.println("quantity = "+ Quantity);
        System.out.println("Harga = "+ price);
        System.out.println("Artis = "+ artist);
        System.out.println("Jumlah lagu = "+ totalSong);
        System.out.println("Label = "+ label);
    }

}