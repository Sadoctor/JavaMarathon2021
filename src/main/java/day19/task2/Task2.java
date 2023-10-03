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

        while (sc1.hasNextLine()){
            String line = sc1.nextLine();
            String [] car = line.split(" ");

            int carKey = Integer.parseInt(car[0]);  // Есть ли необходимость вводить дополнительные переменные для лучшей читабельности кода?
            int carX = Integer.parseInt(car[1]);
            int carY = Integer.parseInt(car[2]);

            cars.put(carKey, new Point(carX, carY));

        }

        sc1.close();

//        for (Map.Entry<Integer, Point> car: cars.entrySet()) {
//            System.out.println(car.getKey() + " : " + car.getValue().toString());
//        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите 4 координаты");

        System.out.print("х1: ");
        int x1 = sc2.nextInt();
        System.out.print("у1: ");
        int y1 = sc2.nextInt();
        System.out.print("х2: ");
        int x2 = sc2.nextInt();
        System.out.print("у2: ");
        int y2 = sc2.nextInt();
        
        sc2.close();
        
//        System.out.println("Координаты первой точки: (" + x1 + ", " + y1 + ") \nКоординаты второй точки: (" + x2 + ", " + y2 + ")");

        int sumCars = 0;
        System.out.print("Идентификаторы машин, которые находятся внутри квадрата: ");
        for (Map.Entry<Integer, Point> car: cars.entrySet()) {
           int keyCar = car.getKey();
           if((cars.get(keyCar).getX() > x1 && cars.get(keyCar).getX() < x2) && (cars.get(keyCar).getY() > y1 && cars.get(keyCar).getY() < y2)){
               System.out.print(car.getKey() + " ");
               sumCars++;
           }
        }
//        System.out.println();
        System.out.println("\nОбщее количество машин в квадрате: " + sumCars);

    }
}

