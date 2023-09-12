package day11.task1;

public class Picker implements Worker{
    public static final int PICKER_SALARY = 80;
    public static final int PICKER_BONUS = 70000;


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
        salary += PICKER_SALARY;
        warehouse.addCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (!isPayed)  {
            if (warehouse.getCountPickedOrders() < ORDERS_FOR_BONUS)
                System.out.println("Бонус пока не доступен");
            else {
                salary += PICKER_BONUS;
                isPayed = true;
            }
        }
        else System.out.println("Бонус уже был выплачен");
    }
}
