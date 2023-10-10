package SeaBattle;

import java.util.ArrayList;
import java.util.Scanner;

public class TorpedoBoat extends Ship {
    public TorpedoBoat(int x1, int y1) {
        super(x1, y1);
    }

    private void putTorpedoBoat(String[][] battlefield) {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {

                if ((i == getX1() - 1 | i == getX1() + 1) && (j == getY1() + 1 | j == getY1() - 1)) {      // Угловые ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }

                if (i == getX1() && (j == getY1() + 1 | j == getY1() - 1)) {                     // Левая, правая ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }

                if ((i == getX1() + 1 | i == getX1() - 1) && j == getY1()) {                     // Верхняя, нижняя ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }

                if (i == getX1() && j == getY1()) {                                          // Установка ячейки корабля х1,у1
                    battlefield[i][j] = SHIP;
                }
            }
        }

    }

    public static void checkAndPutTorpedoBoat(String[][] battlefield, ArrayList<Ship> shipsList, int number) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введи координаты " + number + "-го однопалубного корабля (формат: х,у)");
                String line = scanner.nextLine();

                boolean hasOtherChars = !line.matches("[1234567890],[1234567890]");          // Проверка, что каждая из координат корректна
                if (hasOtherChars)
                    throw new IllegalArgumentException("Некорректный ввод координат");
                String[] a = line.split(",");

                int x = Integer.parseInt(a[1]);                                                     // Инициализация координат
                int y = Integer.parseInt(a[0]);

                for (String[] strings : battlefield) {
                    for (int j = 0; j < strings.length; j++) {
                        if (battlefield[x][y].equals(SHIP)) {                                       // Проверка, стоит ли уже в клетке другой корабль
                            throw new IllegalArgumentException("Корабль необходимо разместить на свободном месте карты (данная клетка занята другим кораблем)");
                        }

                        if (battlefield[x][y].equals(BLUE_SQUARE)) {                                // Проверка, попадает ли наш корабль в ореолу другого корабля
                            throw new IllegalArgumentException("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (корабль попадает в ореолу другого корабля)");
                        }
                    }
                }
                TorpedoBoat torpedoBoat = new TorpedoBoat(x, y);                                   // Создание корабля с проверенными координатами
                shipsList.add(torpedoBoat);
                torpedoBoat.putTorpedoBoat(battlefield);                                           // Установка корабля на игровое поле
                break;

            } catch (IllegalArgumentException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}
