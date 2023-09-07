package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed = false;
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
        salary += 100;
        warehouse.addCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        else if (warehouse.getCountDeliveredOrders() > 10000)
            System.out.println("Бонус уже был выплачен");
        else { salary += 50000; isPayed = true; }
    }
}
