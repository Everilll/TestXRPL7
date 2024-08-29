public class Car {
    private int year;
    private String car;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCar() {
        return this.car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Car(int year, String car) {
        this.year = year;
        this.car = car;
    }

    public void print() {
        System.out.println("Tahun :"+year);
        System.out.println("Mobil :"+car);
    }
}
