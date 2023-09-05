package day7;

public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
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

    public void run() {
        switch (stamina) {
            case MIN_STAMINA:
                break;
            case 1:stamina--; countPlayers--;
                break;
            default: stamina--;
        }
    }

//    public static String stringCountPlayers(int n){
//        String string = "Команды неполные. На поле еще есть ";
//        switch (n){
//            case 1:
//                string = string + n + " свободное место";
//                break;
//            case 5:
//                string = string + n + " свободных мест";
//                break;
//            default: string = string + n + " свободных места";
//        }
//        return string;
//    }
//
//    public static void info() {
//        switch (countPlayers) {
//            case 1:
//                System.out.println(Player.stringCountPlayers(5));
////                System.out.println("Команды неполные. На поле еще есть 5 свободных мест");
//                break;
//            case 2:
//                System.out.println(Player.stringCountPlayers(4));
////                System.out.println("Команды неполные. На поле еще есть 4 свободных места");
//                break;
//            case 3:
//                System.out.println(Player.stringCountPlayers(3));
////                System.out.println("Команды неполные. На поле еще есть 3 свободных места");
//                break;
//            case 4:
//                System.out.println(Player.stringCountPlayers(2));
////                System.out.println("Команды неполные. На поле еще есть 2 свободных места");
//                break;
//            case 5:
//                System.out.println(Player.stringCountPlayers(1));
////                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
//                break;
//            default:
//                System.out.println("На поле нет свободных мест");
//        }
//    }

//    public static void info() {
//        String string = "Команды неполные. На поле еще есть " + (6 - countPlayers);
//
//        switch (countPlayers) {
//            case 1:
//                string = string + " свободных мест";
//                break;
//            case 2: case 3: case 4:
//                string = string + " свободных места";
//                break;
//            case 5:
//                string = string + " свободное место";
//                break;
//            case 6:
//                string = "На поле нет свободных мест";
//                default: break;
//        }
//        System.out.println(string);
//    }

    public static void info() {
        StringBuilder string = new StringBuilder("Команды неполные. На поле еще есть " + (6 - countPlayers));

        switch (countPlayers) {
            case 1:
                string.append(" свободных мест");
                break;
            case 2: case 3: case 4:
                string.append(" свободных места");
                break;
            case 5:
                string.append(" свободное место");
                break;
            case 6:
                string.replace(0,string.length(),"На поле нет свободных мест");
            default:
                break;
        }
        System.out.println(string);
    }
}
