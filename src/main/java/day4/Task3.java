package day4;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(51);
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int max_sum = 0;
        int imax = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
                }
//            System.out.println("Сумма элементов строки с индексом " + i + " = " + sum);
            if (sum > max_sum) {
                max_sum = sum;
                imax = i;
            }
        }
//        System.out.println();
        System.out.println("Индекс строки, сумма чисел в которой максимальна = " + imax);
    }
}
