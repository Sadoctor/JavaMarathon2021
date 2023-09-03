package day7;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers <6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {         // Выдаает ошибку countWhenStamina0(): "Вызов метода run, 4 раза на объекте класса Player (stamina = 1),
        if (stamina == 0)       // при общем кол-ве игроков 4. Общее количество игроков стало" Expected :3; Actual :1
            countPlayers--;     // Выдаает ошибку run1(): Создан один экземпляр Player. Вызов метода run,
        else stamina--;         // 1 раз на объекте класса Player (stamina = 1). Общее количество игроков ==> Expected :0; Actual   :1
    }

    public static void info() {
        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле еще есть 5 свободных мест");
                break;
            case 2:
                System.out.println("Команды неполные. На поле еще есть 4 свободных мест");
                break;
            case 3:
                System.out.println("Команды неполные. На поле еще есть 3 свободных мест");
                break;
            case 4:
                System.out.println("Команды неполные. На поле еще есть 2 свободных мест");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                break;
            default: System.out.println("На поле нет свободных мест");

        }
    }
}
