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

        Scanner sc1 = new Scanner(file);
        sc1.useDelimiter("[„<>«».,:;()?!\"\\s–]+");

        Map<String, Integer> countWords = new HashMap<>();

        int count = 0;
        while(sc1.hasNext()) {                                                          // Занесение всех слов в Мар
            countWords.put(sc1.next(), 1);
            count++;
        }
        System.out.println("Колличество обработанных слов = " + count);
        System.out.println("Колличество слов в словаре = " + countWords.size());

        Scanner sc2 = new Scanner(file);
        sc2.useDelimiter("[„<>«».,:;()?!\"\\s–]+");

        while(sc2.hasNext()) {                                                          // Подсчет и запись кол-ва вхождеий каждого слова в тексте
            String str = sc2.next();
            if (countWords.containsKey(str))
                countWords.replace(str, (countWords.get(str) + 1));
        }

        for (Map.Entry<String, Integer> word: countWords.entrySet()) {                  // Вывод Map в консоль
            System.out.println(word.getKey() + " : " + word.getValue());                // Чичиков - 608
        }

        System.out.println("100 самых часто используемых слов: ");
        for(int i = 0; i < 100; i++){                                                    // Цикл для вывода ста максимально встречающихся слов
            String maxKey = Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getKey();  // Ключ с максимальным значением в Map
            int maxValue = Collections.max(countWords.entrySet(), Map.Entry.comparingByValue()).getValue(); // Максимальное значение в Map
            System.out.println((i + 1) + ") " + maxKey + " : " + maxValue);              // Вывод элемента словаря
            countWords.replace(maxKey, 0);                                               // Перезапись максимального значения на минимальное
        }

        sc1.close();
        sc2.close();
    }
}
