package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(".txt");
        printResult(file);

    }
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String [] numbers = line.split(" ");

            double count = 0;
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
                count++;
            }


            System.out.println(sum / count + " --> " + Math.round((sum / count) * 1000.0) / 1000.0);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}

