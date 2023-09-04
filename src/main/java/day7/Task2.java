package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomStamina;

        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p1 = new Player(randomStamina);
        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p2 = new Player(randomStamina);
        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p3 = new Player(randomStamina);
        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p4 = new Player(randomStamina);
        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p5 = new Player(randomStamina);
        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
        Player p6 = new Player(randomStamina);

//        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
//        Player p7 = new Player(randomStamina);
//        randomStamina = random.nextInt( Player.MAX_STAMINA - 90 + 1) + 90;
//        Player p8 = new Player(randomStamina);
//
//        Player.info();

        Player.info();

        for (int i = p1.getStamina(); i != 0 ; i--){
            p1.run();
            System.out.println("Стамина 1 игрока = " + p1.getStamina());
        }

        Player.info();

    }
}
