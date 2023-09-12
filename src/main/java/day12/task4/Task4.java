package day12.task4;

import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {


//        MusicBand mb1 = new MusicBand("Toe", 2000, Arrays.asList("Касикура Такаси", "Мино Такааки", "Яманэ Сатоси", "Ямадзаки Хирокадзу")));
//        MusicBand mb2 = new MusicBand("AC/DC", 1973, Arrays.asList("Серджи Амальфитано", "Эдди Оропеза", "Райан Корбетт", "Хорхе Луис Эррер")));
//        MusicBand mb3 = new MusicBand("KISS", 1973, Arrays.asList("Пол Стэнли", "Питер Крисс", "Джин Симмонс", "Эйс Фрейли")));
//        MusicBand mb4 = new MusicBand("Король и Шут", 1988, Arrays.asList("Михаил Горшенёв", "Нефедова Мария", "Александр Балунов", "Дмитрий Ришко", "Андрей Князев", "Сергей Захаров", "Алексей Горшенёв")));
//        MusicBand mb5 = new MusicBand("Metallica", 1981, Arrays.asList("Джеймс Хетфилд", "Ларс Ульрих", "Кирк Хэмметт", "Клифф Бёртон", "Роберт Трухильо", "Джейсон Ньюстед", "Рон Макговни", "Дэйв Мастейн")));
//        MusicBand mb6 = new MusicBand("Rammstein", 1994, Arrays.asList("Тилль Линдеманн", "Пауль Ландерс", "Рихард Круспе", "Оливер Ридель", "Кристоф Шнайдер", "Кристиан Лоренц")));
//        MusicBand mb7 = new MusicBand("Корни", 2002, Arrays.asList("Александр Асташёнок", "Алексей Кабанов", "Павел Артемьев", "Александр Бердников")));
//        MusicBand mb8 = new MusicBand("ssshhhiiittt", 2015, Arrays.asList("Никита Кислов", "Виталий Исаков", "Иван Грачев", "Александр Камод")));
//        MusicBand mb9 = new MusicBand("Валентин Стрыкало", 2010, Arrays.asList("Юрий Каплан", "Станислав Мурашко")));
//        MusicBand mb10 = new MusicBand("Би-2", 1988, Arrays.asList("Александр Уман", "Егор Бортник", "Ян Николенко", "Андрей Звонков", "Борис Лифшиц", "Макс Андрющенко")));
        List<String> members1 = new LinkedList<>();
        members1.add("Касикура Такаси");
        members1.add("Мино Такааки");
        members1.add("Яманэ Сатоси");
        members1.add("Ямадзаки Хирокадзу");

        MusicBand mb1 = new MusicBand("Toe", 2000, members1);

        List<String> members2 = new LinkedList<>();
        members2.add("Юрий Каплан");
        members2.add("Станислав Мурашко");

        MusicBand mb2 = new MusicBand("Валентин Стрыкало", 2010, members2);

        MusicBand.transferMembers(mb1, mb2);

        MusicBand.printMembers(mb1);
        MusicBand.printMembers(mb2);



    }
}
