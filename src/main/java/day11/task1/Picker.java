package day11.task1;

public class Picker implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString(){
        return "Заработная плата: " +getSalary() + ", выплата бонуса - " + getIsPayed();
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork(){
        salary += 80;
        warehouse.addCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        else if (warehouse.getCountPickedOrders() > 10000)
            System.out.println("Бонус уже был выплачен");
        else { salary += 70000; isPayed = true; }
    }
}
