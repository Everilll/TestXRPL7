public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        number = 11;
        name = "DVD Bernadya";
        Quantity = 50;
        price = 100000;
        length = 100;
        rating = "NC-14";
        studio = "Kinza Slebeww";
    }
        public void print() {
            System.out.println("Number = "+ number);
            System.out.println("Nama = "+ name);
            System.out.println("Quantity = "+ Quantity);
            System.out.println("Harga = "+ price);
            System.out.println("Length = "+ length);
            System.out.println("Rating = "+ rating);
            System.out.println("Studio = "+ studio);
            }
    
        }

    

