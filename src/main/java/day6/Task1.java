package day6;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputYear = scan.nextInt();

        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setColor("Red");
        car1.setYear(2018);

        car1.info();
        System.out.println("Данному автомобилю " + car1.yearDifference(inputYear) + " лет");

        Motorbike bike1 = new Motorbike("Yamaha", "Green", 2015);
        bike1.info();
        System.out.println("Данному мотоциклу " + bike1.yearDifference(inputYear) + " лет");
        }
}
