package day4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10001);
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Наибольший элемент массива = " + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Наименьший элемент массива = " + min);

        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + count);
        System.out.println("Cумма элементов массива, оканчивающихся на 0 = " + sum);



    }
   }

