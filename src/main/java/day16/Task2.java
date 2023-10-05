package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

//        file1.getParentFile().mkdirs();
//        file2.getParentFile().mkdirs();

        try {
            PrintWriter pw1 = new PrintWriter(file1);
            Random random = new Random();

            int randomNumberFile1;
            for(int i = 0; i < 1000; i++){
                randomNumberFile1 = random.nextInt(101);
                pw1.print(randomNumberFile1 + " ");
            }
            pw1.close();

            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);

            String line = scanner.nextLine();
            String [] randomNumbers = line.split(" ");

            int count = 0;
            double sum = 0;
            for (String number : randomNumbers) {
                count++;
                sum += Integer.parseInt(number);
                if (count % 20 == 0){
                    pw2.print(sum / 20 + " ");
                    sum = 0;
                }
            }
            pw2.close();

            printResult(file2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
}

    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)){

            String line = scanner.nextLine();
            String [] numbers = line.split(" ");

            int sum = 0;
            for(String number: numbers){
                sum += Double.parseDouble(number);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Подаваемый файл не найден");
        }
    }
}
