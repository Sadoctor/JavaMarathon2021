package SeaBattle;

/* Быстрые примеры координат

String sampleCoordinates_1 = "0,0;0,1;0,2;0,3" + "2,6;2,7;2,8" + "3,2;4,2;5,2" + "4,4;4,5" + "7,2;7,3" + "9,8;9,9" + "2,0" + "9,0" + "7,6" + "4,8";
String sampleCoordinates_2 = "0,0;0,1;0,2;0,3" + "0,5;0,6;0,7" + "2,0;2,1;2,2" + "2,4;2,5" + "2,7;2,8" + "4,0;4,1" + "0,9" + "4,3" + "4,5" + "4,7";

 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static SeaBattle.Battleship.*;
import static SeaBattle.Cruiser.*;
import static SeaBattle.Destroyer.*;
import static SeaBattle.TorpedoBoat.*;

public class SeaBattle {
    public static void main(String[] args) {

        String[][] battlefield_1 = new String[10][10];                                                                      // Создаем поле_1
        ArrayList<Ship> shipsList_1 = new ArrayList<>();                                                                    // Создаем список_кораблей_1

        System.out.println("Сначала свои корабли расставляет 1-й игрок, затем их расставляет 2-ой игрок.\n" +
                "Размер поля 10х10. Система координат от 0 до 9.\n" +
                "Пока 1-й игрок расставляет корабли, 2-му игроку необходимо отвернуться от экрана.\n");

        createShips(battlefield_1, shipsList_1);                                                                            // Создаем и добавляем корабли в список_кораблей_1

        System.out.println("Корабли 1-го игрока расставлены.\n" +
                "Пока 2-ой игрок расставляет корабли, 1-му игроку необходимо отвернуться от экрана\n");

        String[][] battlefield_2 = new String[10][10];                                                                      // Создаем поле_1
        ArrayList<Ship> shipsList_2 = new ArrayList<>();                                                                    // Создаем список кораблей_1

        createShips(battlefield_2, shipsList_2);                                                                            // Создаем и добавляем корабли в список_кораблей_2

        System.out.println("Корабли 2-го игрока расставлены.\n" + "Игрок, который будет ходить первым, выбирается случайным образом.\n");

        Random random = new Random();                                                                                       // Высчитываем какой игрок будет ходить первым
        if (random.nextInt(2) == 0) {                                                                                // Если это первый игрок
            while (true) {
                System.out.println("Ходит 1-й игрок.");
                shot(battlefield_2, shipsList_2);                                                                           // Стреляет первый игрок
                if (shipsList_2.isEmpty())
                    break;
                System.out.println("Ходит 2-ой игрок.");
                shot(battlefield_1, shipsList_1);                                                                           // Стреляет второй игрок
                if (shipsList_1.isEmpty())
                    break;
            }
        } else {                                                                                                            // Аналогично если это второй игрок
            while (true) {
                System.out.println("Ходит 2-ой игрок.");
                shot(battlefield_1, shipsList_1);
                if (shipsList_1.isEmpty())
                    break;
                System.out.println("Ходит 1-й игрок.");
                shot(battlefield_2, shipsList_2);
                if (shipsList_2.isEmpty())
                    break;
            }
        }

        if (shipsList_1.isEmpty()) {
            System.out.println("Второй игрок выйграл");
        } else System.out.println("Первый игрок выйграл");
    }

    public static void printBattlefield(String[][] battlefield) {
        for (String[] strings : battlefield) {
            for (String string : strings)
//                System.out.printf("%5s", string);
                System.out.print(string);
            System.out.println();
        }
    }

    public static void createShips(String[][] battlefield, ArrayList<Ship> shipsList) {

        for (int i = 0; i < battlefield.length; i++) {                                                                                      // Заполнение игрового поля белыми клетками
            for (int j = 0; j < battlefield[i].length; j++)
                battlefield[i][j] = WHITE_SQUARE;
        }

        checkAndPutBattleship(battlefield, shipsList);
        printBattlefield(battlefield);
        System.out.println();

        checkAndPutCruiser(battlefield, shipsList, 1);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutCruiser(battlefield, shipsList, 2);
        printBattlefield(battlefield);
        System.out.println();

        checkAndPutDestroyer(battlefield, shipsList, 1);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutDestroyer(battlefield, shipsList, 2);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutDestroyer(battlefield, shipsList, 3);
        printBattlefield(battlefield);
        System.out.println();

        checkAndPutTorpedoBoat(battlefield, shipsList, 1);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutTorpedoBoat(battlefield, shipsList, 2);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutTorpedoBoat(battlefield, shipsList, 3);
        printBattlefield(battlefield);
        System.out.println();
        checkAndPutTorpedoBoat(battlefield, shipsList, 4);
        printBattlefield(battlefield);
        System.out.println();

    }

    public static void shot(String[][] battlefield, ArrayList<Ship> shipsList) {
        boolean hit = true;
        while (hit && !shipsList.isEmpty()) {                                                                               // Цикл работает пока игрок не промазал или у его противника остались корабли
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введи координаты для выстрела (формат: х,у)");
                String line = scanner.nextLine();

                boolean hasOtherChars = !line.matches("[1234567890],[1234567890]");                                 // Проверка, что каждая из координат корректна
                if (hasOtherChars) throw new IllegalArgumentException("Некорректный ввод координат");
                String[] coords = line.split(",");

                int x = Integer.parseInt(coords[1]);                                                                       // Инициализация координат
                int y = Integer.parseInt(coords[0]);

                if (battlefield[x][y].equals(WHITE_SQUARE) | battlefield[x][y].equals(BLUE_SQUARE)) {                       // Выстрел в холостую?
                    battlefield[x][y] = RED_SQUARE;
                    System.out.println("Мимо");
                    hit = false;                                                                                            // Переменная для выхода из цикла
                } else if (battlefield[x][y].equals(RED_SQUARE)) {                                                          // По этим координатам уже стреляли?
                    System.out.println("Эти координаты уже были обстреляны");
                } else {                                                                                                    // Значит попали в корабль...
                    battlefield[x][y] = RED_SQUARE;
                    int countShipsOld = shipsList.size();                                                                   // Переменная, созданная вывода "Попадание!"
                    for (int i = 0; i < shipsList.size(); i++) {                                                            // Заходим в цикл для проверки всех кораблей на наличие попадания

                        Ship ship = shipsList.get(i);

                        if (ship instanceof TorpedoBoat) {                                                                  // Если корабль, на котором мы находимся, является торпедным катером...
                            if (x == ship.getX1() && y == ship.getY1()) {                                                   // Его координаты совпадают с координатами выстрела?
                                ship.setX1(-1);                                                                             // меняем координаты на "координаты подбитого корабля"
                                ship.setY1(-1);
                            }
                            if (ship.getX1() == -1 && ship.getY1() == -1) {                                                 // Координаты корабля являются "координатами подбитого корабля"?
                                System.out.println(DROWNED);
                                shipsList.remove(i);                                                                        // удаляем подбитый корабль из пула "живых" кораблей
                                System.out.println("Оставшееся количество кораблей = " + shipsList.size());
                            }
                        }

                        if (ship instanceof Destroyer) {                                                                    // Аналогично TorpedoBoat
                            if (x == ship.getX1() && y == ship.getY1()) {
                                ship.setX1(-1);
                                ship.setY1(-1);
                            }
                            if (x == ship.getX2() && y == ship.getY2()) {
                                ship.setX2(-1);
                                ship.setY2(-1);
                            }
                            if ((ship.getX1() == -1 && ship.getY1() == -1) && (ship.getX2() == -1 && ship.getY2() == -1)) {
                                System.out.println(DROWNED);
                                shipsList.remove(i);
                                System.out.println("Оставшееся количество кораблей = " + shipsList.size());
                            }
                        }

                        if (ship instanceof Cruiser) {                                                                      // Аналогично TorpedoBoat
                            if (x == ship.getX1() && y == ship.getY1()) {
                                ship.setX1(-1);
                                ship.setY1(-1);
                            }
                            if (x == ship.getX2() && y == ship.getY2()) {
                                ship.setX2(-1);
                                ship.setY2(-1);
                            }
                            if (x == ship.getX3() && y == ship.getY3()) {
                                ship.setX3(-1);
                                ship.setY3(-1);
                            }
                            if ((ship.getX1() == -1 && ship.getY1() == -1) && (ship.getX2() == -1 && ship.getY2() == -1) && (ship.getX3() == -1 && ship.getY3() == -1)) {
                                System.out.println(DROWNED);
                                shipsList.remove(i);
                                System.out.println("Оставшееся количество кораблей = " + shipsList.size());
                            }
                        }

                        if (ship instanceof Battleship) {                                                                   // Аналогично TorpedoBoat
                            if (x == ship.getX1() && y == ship.getY1()) {
                                ship.setX1(-1);
                                ship.setY1(-1);
                            }
                            if (x == ship.getX2() && y == ship.getY2()) {
                                ship.setX2(-1);
                                ship.setY2(-1);
                            }
                            if (x == ship.getX3() && y == ship.getY3()) {
                                ship.setX3(-1);
                                ship.setY3(-1);
                            }
                            if (x == ship.getX4() && y == ship.getY4()) {
                                ship.setX4(-1);
                                ship.setY4(-1);
                            }
                            if ((ship.getX1() == -1 && ship.getY1() == -1) && (ship.getX2() == -1 && ship.getY2() == -1) && (ship.getX3() == -1 && ship.getY3() == -1) && (ship.getX4() == -1 && ship.getY4() == -1)) {
                                System.out.println(DROWNED);
                                shipsList.remove(i);
                                System.out.println("Оставшееся количество кораблей = " + shipsList.size());
                            }
                        }
                    }
                    if (shipsList.size() == countShipsOld) {                                                                // Если кораблей не стало меньше, то по какому-то из них попали, но не потопили...
                        System.out.println(HIT);                                                                            // ЗНАЧИТ ВЫВОДИМ HIT!!! (с этим выяснением был ли корабль потоплен или только поврежден голову я сломал так, что заработал ЧМТ)
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}



