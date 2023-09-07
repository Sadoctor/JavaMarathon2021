package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Владислав", "613");
        Teacher t1 = new Teacher("Борис", "Биология");

        System.out.println(s1.getGroupName());
        System.out.println(t1.getSubjectName());

        s1.printInfo();
        t1.printInfo();
    }
}
