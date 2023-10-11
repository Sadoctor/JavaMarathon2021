package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Борис/IdeaProjects/JavaMarathon2021/src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[„<>«».,:;()?!\"\\s–]+");

        Map<String, Integer> countWords = new HashMap<>();

        int count = 0;
        while (scanner.hasNext()) {
            String line = scanner.next();
            if (countWords.containsKey(line)) {
                countWords.replace(line, (countWords.get(line) + 1));
            } else {
                countWords.put(line, 1);
                count++;
            }
        }

        System.out.println("Колличество обработанных слов = " + count);
        System.out.println("Колличество слов в словаре = " + countWords.size());

        for (Map.Entry<String, Integer> word : countWords.entrySet()) {                  // Вывод Map в консоль
            System.out.println(word.getKey() + " : " + word.getValue());                // Чичиков - 607
        }

        System.out.println("100 самых часто используемых слов: ");
        for (int i = 0; i < 100; i++) {                                                    // Цикл для вывода ста максимально встречающихся слов
            String maxKey = Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getKey();  // Ключ с максимальным значением в Map
            int maxValue = Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getValue(); // Максимальное значение в Map
            System.out.println((i + 1) + ") " + maxKey + " : " + maxValue);              // Вывод элемента словаря
            countWords.replace(maxKey, 0);                                               // Перезапись максимального значения на минимальное
        }
        scanner.close();
    }
}
