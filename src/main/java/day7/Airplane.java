package day7;


public class Airplane {

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length > airplane2.length)
            System.out.println("Первый самолет длинее, чем второй");
        else System.out.println("Второй самолет длинее, чем первый");
    }

    private String manufacturer; // изготовитель
    private int year;            // год выпуска
    private int length;          // длина
    private int weight;          // вес
    private int fuel;            // количество топлива в баке

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + "(м), вес: " + weight + "(т), количество топлива в баке: " + fuel + "(л)");
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }
}
