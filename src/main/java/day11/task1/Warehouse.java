package day11.task1;

public class Warehouse {

    private int countPickedOrders, countDeliveredOrders;

    public int  getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void addCountPickedOrders() {
        countPickedOrders++;
    }

    public void addCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    public String toString(){
        return "Количество собранных заказов: " + getCountPickedOrders() + ", количество доставленных заказов " + getCountDeliveredOrders();
    }
}
