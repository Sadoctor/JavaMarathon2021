package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

        Warehouse warehouse2 = new Warehouse();
        Picker picker3 = new Picker(warehouse2);
        Courier courier4 = new Courier(warehouse2);

        picker3.doWork();
        courier4.doWork();

        System.out.println(warehouse1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

    }
    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++)
            worker.doWork();
        worker.bonus();
    }


}

