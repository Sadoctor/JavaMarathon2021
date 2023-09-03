package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boing737 = new Airplane("USA", 2010, 30, 31);
        Airplane sukhoiSuperjet100 = new Airplane("Russia", 2007, 29, 24);
        Airplane.compareAirplanes(boing737, sukhoiSuperjet100);
    }
}