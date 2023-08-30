package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
//        System.out.println("Введите число x");
        double  x = myInt.nextDouble();

        if(x >= 5){
            double  y = (x * x - 10) / (x + 7);
            System.out.println(y);
        }
        else if(x > -3 && x < 5){
            double  y = (x + 3) * (x * x - 2);
            System.out.println(y);
        }
        else {
            double  y = 420;
            System.out.println(y);
        }


    }
}
