package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int number1 = 0;
        int nubmer2 = 30;
        int nubmer3 = 300;
        int nubmer4 = 350;

        List<Integer> numbers = new ArrayList<>();
        numberRange(number1, nubmer2, nubmer3, nubmer4, numbers);
        System.out.println(numbers);
    }

    public static void numberRange(int number1, int nubmer2, int nubmer3, int nubmer4, List<Integer> numbers) {
        for (int i = number1; i <= nubmer2; i++) {
            if (i % 2 == 0)
                numbers.add(i);
        }
        for (int i = nubmer3; i <= nubmer4; i++) {
            if (i % 2 == 0)
                numbers.add(i);
        }
    }
}
