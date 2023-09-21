package day18;

public class Task2 {
    public static void main(String[] args) {
    int i = 717771237;
        System.out.println(count7(i));

//    for(int n = 0; n < 10; n++){
//        if(i % 10 == 7){
//            count++;
//        }
//        i = i / 10;
//    }
//        System.out.println(count);
    }
    public static int count7(int number){
        if (number < 1)
            return 0;
        if (number % 10 != 7)
            return count7(number / 10);
        else
            return 1 + count7(number / 10);
    }
}
