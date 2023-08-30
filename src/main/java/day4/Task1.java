package day4;

import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }

//        for(int i: arr){
//            arr[i] = random.nextInt(11);
//        }

        for (int i: arr){
            System.out.print(arr[i] + " ");
        }

//        System.out.println(Arrays.toString(arr));

        System.out.println("Длина массива: " + arr.length);

        int eight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                eight++;
            }
        }
        System.out.println("Количество чисел больше 8: " + eight);

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 8) {
//                eight++;
//            }
//        }
//        System.out.println("Количество чисел больше 8: " + eight);

        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one++;
            }
        }
        System.out.println("Количество чисел равных 1: " + one);

        int evenNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumber++;
            }
        }
        System.out.println("Количество четных чисел: " + evenNumber);

        int oddNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumber++;
            }
        }
        System.out.println("Количество нечетных чисел: " + oddNumber);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Сумма всех элементов массива: " + sum);

    }
}
