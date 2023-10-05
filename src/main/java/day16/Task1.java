package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(".txt");

        printResult(file);
    }

    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)){                      // Обработка исключения отсутствия самого файла
            try {                                                       // Обработка исключения пустого файла
                if (!scanner.hasNextLine())
                    throw new NoSuchElementException("Файл пустой");

                String line = scanner.nextLine();
                String [] numbers = line.split(" ");

                double count = 0;
                int sum = 0;
                for (String number : numbers) {
                    sum += Integer.parseInt(number); // Если в файле присутствуют любые другие элементы кроме цифр, то в этом месте выскакивает исключение NumberFormatException
                    count++;
                }

//            System.out.println(sum / count + " --> " + Math.round((sum / count) * 1000.0) / 1000.0);
            System.out.printf(sum / count + " --> %.3f", (sum / count));

            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
