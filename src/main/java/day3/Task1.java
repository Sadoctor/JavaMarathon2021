package day3;


import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city_1 = scanner.nextLine();

        while(!city_1.equals("Stop")){
            switch (city_1){
                case "Москва": case "Владивосток": case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим": case "Милан": case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль": case "Манчестер": case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин": case "Мюнхен": case "Кёльн":
                    System.out.println("Германия");
                    break;
                default: System.out.println("Неизвестная страна");
            }
            String city_2 = scanner.nextLine();
            city_1 = city_2;
        }
    }
}
