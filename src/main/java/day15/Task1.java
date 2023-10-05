package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File oldFile = new File("src/main/resources/shoes.csv");

        File newFile = new File("src/main/resources/missing_shoes.txt"); //создали ссылку на не существующий файл
//        newFile.getParentFile().mkdirs(); //создали самостоятельно файл, если бы файл находится не в корневой папке и необходимо создать директорию и все поддиректории для этого файла

        try (PrintWriter printWriter = new PrintWriter(newFile); Scanner scanner = new Scanner(oldFile)) {
            //передали ссылку на файл в конструктор PrintWriter

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");

                try {
                    if (shoes.length != 3)
                        throw new IllegalArgumentException("Неверный входной файл");

                    if (Integer.parseInt(shoes[2]) == 0) {
                        printWriter.println(line);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
