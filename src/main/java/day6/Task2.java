package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane boing737 = new Airplane("USA", 2010, 30, 31);
        boing737.info();

        boing737.setYear(2006);
        boing737.setLength(40);
        boing737.fillUp(6000);
        boing737.fillUp(10000);
        boing737.info();

    }
}
