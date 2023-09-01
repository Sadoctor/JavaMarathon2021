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
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        System.out.println("Наибольший элемент массива = " + max);

        int min = arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        System.out.println("Наименьший элемент массива = " + min);

        int count = 0;
        int sum = 0;
        for (int j : arr) {
            if (j % 10 == 0) {
                count++;
                sum += j;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + count);
        System.out.println("Cумма элементов массива, оканчивающихся на 0 = " + sum);



    }
   }

