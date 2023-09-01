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

//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

        System.out.println(Arrays.toString(arr));

        System.out.println("Длинна массива: " + arr.length);

        int more_8 = 0;
        for (int j : arr) {
            if (j > 8) {
                more_8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + more_8);

        int equals_1 = 0;
        for (int j : arr) {
            if (j == 1) {
                equals_1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + equals_1);

        int even_numbers = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                even_numbers++;
            }
        }
        System.out.println("Количество четных чисел: " + even_numbers);

        int odd_numbers = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                odd_numbers++;
            }
        }
        System.out.println("Количество нечетных чисел: " + odd_numbers);

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}


