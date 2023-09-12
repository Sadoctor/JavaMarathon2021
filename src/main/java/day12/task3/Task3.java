package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> allBands = new ArrayList<>();
        allBands.add(new MusicBand("Toe", 2000));
        allBands.add(new MusicBand("AC/DC", 1973));
        allBands.add(new MusicBand("KISS", 1973 ));
        allBands.add(new MusicBand("Король и Шут", 1988));
        allBands.add(new MusicBand("Metallica", 1981));
        allBands.add(new MusicBand("Rammstein", 1994));
        allBands.add(new MusicBand("Корни", 2002 ));
        allBands.add(new MusicBand("ssshhhiiittt", 2015));
        allBands.add(new MusicBand("Валентин Стрыкало", 2010));
        allBands.add(new MusicBand("Би-2", 1988));

        // Вывод первоначального списка
        System.out.println(allBands);

        // Перемешивание списка и его вывод
        Collections.shuffle(allBands);
        System.out.println(allBands);

        // Вывод списка, состоящий из групп, основанных после 2000 год
        System.out.println(groupsAfter2000(allBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for(MusicBand band: bands){
            if (band.getYear() >= 2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
