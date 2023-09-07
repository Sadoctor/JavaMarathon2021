package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100);
        Paladin paladin = new Paladin(100);
        Magician magician = new Magician(100);
        Shaman shaman = new Shaman(100);

        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());

        paladin.physicalAttack(magician);
        System.out.println(magician.toString());

        shaman.healTeammate(magician);
        System.out.println(magician.toString());

        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());

        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());

        paladin.healHimself();
        System.out.println(paladin.toString());

        System.out.println();

        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
    }
}
