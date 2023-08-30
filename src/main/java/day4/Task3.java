package day4;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        Random random = new Random();



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(7);
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i][j];
        }
        System.out.println("Наибольший элемент массива = " + max);

//        int maxSum = 0;
//        int imax = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[i].length; j++) sum = sum + j;
//            if (sum >= maxSum){
//                maxSum = sum;
//                imax = i;
//            }
//        }
//        System.out.println("Индекс строки, сумма чисел в которой максимальна - " + imax);

//        for (int row = 0; row < arr.length; row++){
//            int sum = 0;
//            for (int c = 0; c < arr[row].length; c++)
//                sum += c;
//            if(sum > max)
//                max = sum;
//            if(row > imax)
//                row = imax;
//        }
//        System.out.println("Максимальная сумма элементов строки = " + max);

    }
}
