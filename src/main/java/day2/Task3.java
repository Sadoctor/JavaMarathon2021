package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
//        System.out.println("Введите первое число");
        int a = myInt.nextInt();
//        System.out.println("Введите второе число");
        int b = myInt.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
        }

        else{
            int i = a;
            while(i < b - 1){
                i++;
                if(i % 5 == 0 &&  i % 10 != 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}