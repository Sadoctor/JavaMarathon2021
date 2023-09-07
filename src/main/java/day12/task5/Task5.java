package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        MusicBand mb1 = new MusicBand("Валентин Стрыкало",2010, Arrays.asList(new MusicArtist("Юрий Каплан", 40), new MusicArtist("Станислав Мурашко", 45)));
        MusicBand mb2 = new MusicBand("KISS", 1973, Arrays.asList(new MusicArtist("Пол Стэнли", 61), new MusicArtist("Питер Крисс", 49), new MusicArtist("Джин Симмонс", 38), new MusicArtist("Эйс Фрейли", 35)));

        MusicBand.transferMembers(mb1, mb2);

        MusicBand.printMembers(mb1);
        MusicBand.printMembers(mb2);

    }
}
