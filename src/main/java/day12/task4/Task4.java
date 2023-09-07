package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<MusicBand> allBands = new ArrayList<>();
        allBands.add(new MusicBand("Toe", 2000, Arrays.asList("Касикура Такаси", "Мино Такааки", "Яманэ Сатоси", "Ямадзаки Хирокадзу")));
        allBands.add(new MusicBand("AC/DC", 1973, Arrays.asList("Серджи Амальфитано", "Эдди Оропеза", "Райан Корбетт", "Хорхе Луис Эррер")));
        allBands.add(new MusicBand("KISS", 1973, Arrays.asList("Пол Стэнли", "Питер Крисс", "Джин Симмонс", "Эйс Фрейли")));
        allBands.add(new MusicBand("Король и Шут", 1988, Arrays.asList("Михаил Горшенёв", "Нефедова Мария", "Александр Балунов", "Дмитрий Ришко", "Андрей Князев", "Сергей Захаров", "Алексей Горшенёв")));
        allBands.add(new MusicBand("Metallica", 1981, Arrays.asList("Джеймс Хетфилд", "Ларс Ульрих", "Кирк Хэмметт", "Клифф Бёртон", "Роберт Трухильо", "Джейсон Ньюстед", "Рон Макговни", "Дэйв Мастейн")));
        allBands.add(new MusicBand("Rammstein", 1994, Arrays.asList("Тилль Линдеманн", "Пауль Ландерс", "Рихард Круспе", "Оливер Ридель", "Кристоф Шнайдер", "Кристиан Лоренц")));
        allBands.add(new MusicBand("Корни", 2002, Arrays.asList("Александр Асташёнок", "Алексей Кабанов", "Павел Артемьев", "Александр Бердников")));
        allBands.add(new MusicBand("ssshhhiiittt", 2015, Arrays.asList("Никита Кислов", "Виталий Исаков", "Иван Грачев", "Александр Камод")));
        allBands.add(new MusicBand("Валентин Стрыкало", 2010, Arrays.asList("Юрий Каплан", "Станислав Мурашко")));
        allBands.add(new MusicBand("Би-2", 1988, Arrays.asList("Александр Уман", "Егор Бортник", "Ян Николенко", "Андрей Звонков", "Борис Лифшиц", "Макс Андрющенко")));

        MusicBand.transferMembers(allBands.get(0), allBands.get(8));

        MusicBand.printMembers(allBands.get(8));
        MusicBand.printMembers(allBands.get(0));


    }
}
