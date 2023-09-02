package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    void evaluate (Student student){
        Random random = new Random();
        int gradeNumber = random.nextInt(4) + 2;
        String gradeWord = " ";
        switch (gradeNumber) {
            case 2: gradeWord = "Неудовлетворительно";
            break;
            case 3: gradeWord = "Удовлетворительно";
            break;
            case 4: gradeWord = "Хорошо";
            break;
            case 5: gradeWord = "Отлично";
            break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + gradeWord + ".");
    }
}

