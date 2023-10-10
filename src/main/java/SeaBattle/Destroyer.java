package SeaBattle;

import java.util.ArrayList;
import java.util.Scanner;

public class Destroyer extends Ship {
    public Destroyer(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    private void putDestroyer(String[][] battlefield) {
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


                if ((i == getX2() - 1 | i == getX2() + 1) && (j == getY2() + 1 | j == getY2() - 1)) {      // Угловые ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if (i == getX2() && (j == getY2() + 1 | j == getY2() - 1)) {                     // Левая, правая ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }
                if ((i == getX2() + 1 | i == getX2() - 1) && j == getY2()) {                     // Верхняя, нижняя ореолы
                    battlefield[i][j] = BLUE_SQUARE;
                }


                if ((i == getX1() && j == getY1()) | (i == getX2() && j == getY2())) {           // Установка ячеек корабля х1,у1;х2,у2
                    battlefield[i][j] = SHIP;
                }
            }
        }
    }

    public static void checkAndPutDestroyer(String[][] battlefield, ArrayList<Ship> shipsList, int number) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введи координаты " + number + "-го двухпалубного корабля (формат: х,у;х,у)");
                String line = scanner.nextLine();

                boolean hasOtherChars = !line.matches("[1234567890],[1234567890];[1234567890],[1234567890]");       // Проверка на корректный ввод координат во всей строке
                if (hasOtherChars)
                    throw new IllegalArgumentException("Некорректный ввод координат");
                String[] a = line.split(";");

                boolean hasOtherChars_1 = !a[0].matches("[1234567890],[1234567890]");                               // Проверка на корректный ввод конкретных координат
                boolean hasOtherChars_2 = !a[1].matches("[1234567890],[1234567890]");
                if (hasOtherChars_1 | hasOtherChars_2)
                    throw new IllegalArgumentException("Некорректный ввод координат");

//                String[] b_1 = a[0].split(",");
//                String[] b_2 = a[1].split(",");

                int x1 = Integer.parseInt(a[0].split(",")[1]);                                                       // Была проблема с тем, что корабль должен был располагаться
                int y1 = Integer.parseInt(a[0].split(",")[0]);                                                       // горизонтально, а располагался верикально. Ну и наоборот.
                int x2 = Integer.parseInt(a[1].split(",")[1]);                                                       // Короче, пришлось применить костыль и я просто поменял считывание
                int y2 = Integer.parseInt(a[1].split(",")[0]);                                                       // элементов в массивах (Х, который был введен с консоли, стал Y и наоборот)

                if (!((x2 == x1 && y2 == (y1 + 1) | y2 == (y1 - 1)) | ((x2 == (x1 + 1) | x2 == (x1 - 1)) && y2 == y1)))
                    throw new IllegalArgumentException("Секции корабля должны быть состыкованы (невалидный корабль)");

                for (String[] strings : battlefield) {
                    for (int j = 0; j < strings.length; j++) {
                        if (battlefield[x1][y1].equals(SHIP) | battlefield[x2][y2].equals(SHIP)) {                          // Проверка, стоит ли уже в клетке другой корабль
                            throw new IllegalArgumentException("Корабль необходимо разместить на свободном месте карты (данная клетка занята другим кораблем)");
                        }

                        if (battlefield[x1][y1].equals(BLUE_SQUARE) | battlefield[x2][y2].equals(BLUE_SQUARE)) {            // Проверка, попадает ли наш корабль в ореолу другого корабля
                            throw new IllegalArgumentException("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (корабль попадает в ореолу другого корабля)");
                        }
                    }
                }
                Destroyer destroyer = new Destroyer(x1, y1, x2, y2);                                                       // Создание корабля с проверенными координатами
                shipsList.add(destroyer);
                destroyer.putDestroyer(battlefield);                                                                       // Установка корабля на игровое поле
                break;

            } catch (IllegalArgumentException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}
