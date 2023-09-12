package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int numberStartOfRange1 = 0;
        int numberEndOfRange1 = 30;
        int numberStartOfRange2 = 300;
        int numberEndOfRange2 = 350;

        List<Integer> numbers = new ArrayList<>();
        numberRange(numberStartOfRange1, numberEndOfRange1, numbers);
        numberRange(numberStartOfRange2, numberEndOfRange2, numbers);

        System.out.println(numbers);
    }

    public static void numberRange(int numberStartOfRange, int numberEndOfRange, List<Integer> numbers) {
        for (int i = numberStartOfRange; i <= numberEndOfRange; i++) {
            if (i % 2 == 0)
                numbers.add(i);
        }
    }
}

