package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Борис/IdeaProjects/JavaMarathon2021/src/main/resources/taxi_cars.txt");

        Scanner sc1 = new Scanner(file);
        Map<Integer, Point> cars = new HashMap<>();

        while (sc1.hasNextLine()) {
            String[] car = sc1.nextLine().split(" ");
            cars.put(Integer.parseInt(car[0]), new Point(Integer.parseInt(car[1]), Integer.parseInt(car[2])));
        }
        sc1.close();

//        for (Map.Entry<Integer, Point> car: cars.entrySet()) {
//            System.out.println(car.getKey() + " : " + car.getValue().toString());
//        }

        while (true) {
            try {
                System.out.println("Введите 4 координаты");

                int x1 = getCoord("x1");
                int y1 = getCoord("y1");
                int x2 = getCoord("x2");
                int y2 = getCoord("y2");

                if (x1 >= x2 | y1 >= y2)
                    throw new IllegalArgumentException("Некорректный ввод координат. x2,y2 должны быть больше x1,y1");

                int sumCars = 0;
                System.out.print("Идентификаторы машин, которые находятся внутри квадрата: ");
                for (Map.Entry<Integer, Point> car : cars.entrySet()) {
                    int keyCar = car.getKey();
                    if ((cars.get(keyCar).getX() > x1 && cars.get(keyCar).getX() < x2) && (cars.get(keyCar).getY() > y1 && cars.get(keyCar).getY() < y2)) {
                        System.out.print(car.getKey() + " ");
                        sumCars++;
                    }
                }
                System.out.println("\nОбщее количество машин в квадрате: " + sumCars);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getCoord(String stringCoord) {
        int correctCoord;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(stringCoord + ": ");

                String line = scanner.nextLine();
                if (!line.matches("[1234567890]+"))
                    throw new IllegalArgumentException("Некорректный ввод координаты. Введите координату еще раз.");

                correctCoord = Integer.parseInt(line);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return correctCoord;
    }
}

