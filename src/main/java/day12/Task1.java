package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Lada");
        cars.add("Tesla");
        cars.add("Mercedes");
        System.out.println(cars);

       cars.add(cars.size()/2, "Haval");
       cars.remove(0);
       System.out.println(cars);

    }
}
