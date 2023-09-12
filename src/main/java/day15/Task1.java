package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File oldFile = new File("src/main/resources/shoes.csv");

        File newFile = new File("src/main/resources/missing_shoes.txt"); //создали ссылку на не существующий файл
        newFile.getParentFile().mkdirs(); //создали самостоятельно файл

        try {
            PrintWriter printWriter = new PrintWriter(newFile); //передали ссылку на файл в конструктор PrintWriter

        try {
            Scanner scanner = new Scanner(oldFile);
            int i = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] shoes = line.split(";");

                if(shoes.length != 3)
                    throw new IllegalArgumentException();

                if (Integer.parseInt(shoes[2]) == 0){

                    printWriter.println(line);
                }
            }
            printWriter.close();


        } catch (FileNotFoundException e) {
            System.out.println("Изначальный файл не найден");
        }

        } catch (FileNotFoundException e) {
            System.out.println("Конечный файл не найден");
        }


    }
}
