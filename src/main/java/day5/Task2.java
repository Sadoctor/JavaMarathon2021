package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("Yamaha", "Black", 2010);
        bike1.getbike();

    }
}

class Motorbike{

    private String model;
    private String color;
    private int year_of_issue;

    public Motorbike(String model, String color, int year_of_issue) {
        this.model = model;
        this.color = color;
        this.year_of_issue = year_of_issue;
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

    public void getbike() {
        System.out.println(getModel());
        System.out.println(getColor());
        System.out.println(getYear_of_issue());
    }
}