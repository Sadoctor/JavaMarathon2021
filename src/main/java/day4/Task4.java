package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10001);
        }

        System.out.println(Arrays.toString(arr));

        int maxSumOfThreeElements = 0;
        int sumOfThreeElements;
        int theFirstNumberOfTheMaxSum = 0;
        for (int i = 0; i < arr.length-2; i++) {
            sumOfThreeElements = arr[i] + arr[i+1] + arr[i+2];
            if (maxSumOfThreeElements < sumOfThreeElements) {
                maxSumOfThreeElements = sumOfThreeElements;
                theFirstNumberOfTheMaxSum = i;
            }
        }
        System.out.println(maxSumOfThreeElements);
        System.out.println(theFirstNumberOfTheMaxSum);
    }
}
