package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        StringBuilder str1 = new StringBuilder("0");
        for(int i = 1; i <= 20000; i++){
            str1.append(" ").append(i);
        }
        System.out.print(str1);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));



        long startTime2 = System.currentTimeMillis();
        String str2 = "0";
        for(int i = 1; i <= 20000; i++){
            str2 = str2 + " " + i;
        }
        System.out.print(str2);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));


    }
}
