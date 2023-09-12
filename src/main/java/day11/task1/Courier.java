package day11.task1;

public class Courier implements Worker {
    public static final int COURIER_SALARY = 100;
    public static final int COURIER_BONUS = 50000;


    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return "Заработная плата: " + getSalary() + ", выплата бонуса - " + getIsPayed();
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += COURIER_SALARY;
        warehouse.addCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (!isPayed)  {
            if (warehouse.getCountDeliveredOrders() < ORDERS_FOR_BONUS)
                System.out.println("Бонус пока не доступен");
            else {
                salary += COURIER_BONUS;
                isPayed = true;
            }
        }
        else System.out.println("Бонус уже был выплачен");
    }
}
