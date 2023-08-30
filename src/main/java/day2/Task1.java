package day2;

import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
//        System.out.println("Введите количество этажей");
        int floor = myInt.nextInt();
        if(floor <= 0){
            System.out.println("Ошибка ввода");
        }
        else if(floor >= 1 && floor <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if(floor >= 5 && floor <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else{
            System.out.println("Многоэтажный дом");
        }
    }
}
