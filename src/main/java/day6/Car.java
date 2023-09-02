package day6;


class Car {

    private String model;
    private String color;
    private int year_of_issue;

    public void setModel(String usermodel) { model = usermodel; }
    public void setColor(String usercolor) { color = usercolor; }
    public void setYear_of_issue(int user_year_of_issue) { year_of_issue = user_year_of_issue; }

    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getYear_of_issue() { return year_of_issue; }

    public void info() { System.out.println("Это автомобиль"); }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year_of_issue);
    }
}