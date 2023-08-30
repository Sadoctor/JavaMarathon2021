package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i != 5){


            double numerator = scanner.nextDouble();
            double denominator = scanner.nextDouble();

            i++;

            if(denominator == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            double quotient = numerator / denominator;
            System.out.println(quotient);


        }
    }
}
