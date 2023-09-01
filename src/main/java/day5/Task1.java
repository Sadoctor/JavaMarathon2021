package day5;


public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Audi");
        car1.setColor("White");
        car1.setYear_of_issue(2020);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear_of_issue());
    }
}

class Car{

    private String model;
    private String color;
    private int year_of_issue;

    public void setModel(String usermodel){
        model = usermodel;
    }
    public void setColor(String usercolor) {
        color = usercolor;
    }
    public void setYear_of_issue(int user_year_of_issue) {
        year_of_issue = user_year_of_issue;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear_of_issue() {
        return year_of_issue;
    }
}