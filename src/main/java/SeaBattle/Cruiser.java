package SeaBattle;

import java.util.ArrayList;
import java.util.Scanner;

public class Cruiser extends Ship {
    public Cruiser(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    private void putCruiser(String[][] battlefield) {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {

                if ((i == getX1() - 1 | i == getX1() + 1) && (j == getY1() + 1 | j == getY1() - 1)) { // Установка ореал для x1,y1 // Угловые ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if (i == getX1() && (j == getY1() + 1 | j == getY1() - 1)) {                                                       // Левая, правая ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if ((i == getX1() + 1 | i == getX1() - 1) && j == getY1()) {                                                       // Верхняя, нижняя ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }


                if ((i == getX2() - 1 | i == getX2() + 1) && (j == getY2() + 1 | j == getY2() - 1)) { // Установка ореал для x2,y2 // Угловые ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if (i == getX2() && (j == getY2() + 1 | j == getY2() - 1)) {                                                       // Левая, правая ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if ((i == getX2() + 1 | i == getX2() - 1) && j == getY2()) {                                                       // Верхняя, нижняя ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }


                if ((i == getX3() - 1 | i == getX3() + 1) && (j == getY3() + 1 | j == getY3() - 1)) { // Установка ореал для x3,y3 // Угловые ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if (i == getX3() && (j == getY3() + 1 | j == getY3() - 1)) {                                                       // Левая, правая ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if ((i == getX3() + 1 | i == getX3() - 1) && j == getY3()) {                                                       // Верхняя, нижняя ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }


                if ((i == getX1() && j == getY1()) | (i == getX2() && j == getY2()) | ((i == getX3() && j == getY3()))) {          // Установка ячеек корабля х1,у1;х2,у2;x3;y3
                    battlefield[i][j] = SHIP;
                }
            }
        }
    }

    public static void checkAndPutCruiser(String[][] battlefield, ArrayList<Ship> shipsList, int number) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введи координаты " + number + "-го трехпалубного корабля (формат: х,у;х,у;x,y)");
                String line = scanner.nextLine();

                boolean hasOtherChars = !line.matches("[1234567890],[1234567890];[1234567890],[1234567890];[1234567890],[1234567890]");
                if (hasOtherChars)                                                                                                          // Проверка на корректный ввод координат во всей строке
                    throw new IllegalArgumentException("Некорректный ввод координат");
                String[] a = line.split(";");

                boolean hasOtherChars_1 = !a[0].matches("[1234567890],[1234567890]");
                boolean hasOtherChars_2 = !a[1].matches("[1234567890],[1234567890]");
                boolean hasOtherChars_3 = !a[2].matches("[1234567890],[1234567890]");
                if (hasOtherChars_1 | hasOtherChars_2 | hasOtherChars_3)                                                                    // Проверка на корректный ввод конкретных координат
                    throw new IllegalArgumentException("Некорректный ввод координат");

                int x1 = Integer.parseInt(a[0].split(",")[1]);                                                                        // Инициализация координат
                int y1 = Integer.parseInt(a[0].split(",")[0]);

                int x2 = Integer.parseInt(a[1].split(",")[1]);
                int y2 = Integer.parseInt(a[1].split(",")[0]);

                int x3 = Integer.parseInt(a[2].split(",")[1]);
                int y3 = Integer.parseInt(a[2].split(",")[0]);

                int[] coords = {x1, y1, x2, y2, x3, y3};
                if (!(coords[1] == coords[3] && coords[3] == coords[5])) {                                                                    // !(корабль находится в вертикальной плоскости?)
                    if (!(coords[0] == coords[2] && coords[2] == coords[4])) {                                                                // !(корабль находится в горизонтальной плоскости?)
                        throw new IllegalArgumentException("Секции корабля должны быть состыкованы (невалидный корабль)");
                    }
                }
                if (!(coords[2] == (coords[0] + 1) && coords[2] == (coords[4] - 1))) {                                                         // !(секции по горизонтали совмещены?)
                    if (!(coords[3] == (coords[1] + 1) && coords[3] == (coords[5] - 1))) {                                                     // !(секции по вертикали совмещены?)
                        throw new IllegalArgumentException("Секции корабля должны быть состыкованы (невалидный корабль)");
                    }
                }

                for (String[] strings : battlefield) {
                    for (int j = 0; j < strings.length; j++) {
                        if (battlefield[x1][y1].equals(SHIP) | battlefield[x2][y2].equals(SHIP) | battlefield[x3][y3].equals(SHIP)) {          // Проверка, стоит ли уже в клетке другой корабль
                            throw new IllegalArgumentException("Корабль необходимо разместить на свободном месте карты (данная клетка занята другим кораблем)");
                        }

                        if (battlefield[x1][y1].equals(BLUE_SQUARE) | battlefield[x2][y2].equals(BLUE_SQUARE) | battlefield[x3][y3].equals(BLUE_SQUARE)) { // Проверка, попадает ли наш корабль в ореолу другого корабля
                            throw new IllegalArgumentException("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (корабль попадает в ореолу другого корабля)");
                        }
                    }
                }

                Cruiser cruiser = new Cruiser(x1, y1, x2, y2, x3, y3);                                                                          // Создание корабля с проверенными координатами
                shipsList.add(cruiser);
                cruiser.putCruiser(battlefield);                                                                                                // Установка корабля на игровое поле
                break;

            } catch (IllegalArgumentException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}
