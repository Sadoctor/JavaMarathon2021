package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copy));

        System.out.println(recursionSum(numbers, 0));
    }
//    public static int recursionSum(int [] numbers){
//        if (numbers.length == 0)
//            return 0;
//        else return numbers[0] + recursionSum(Arrays.copyOfRange(numbers, 1, numbers.length));
//    }

    public static int recursionSum(int [] numbers, int n){
        if (n == numbers.length)
            return 0;

        return numbers[n] + recursionSum(numbers, n + 1);
    }
}

