import java.util.*;

public class StudentDetail {
    public static class Student {
        String name;
        int roll;
        double per;
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Rishikant Kumar";
        x.roll = 67;
        x.per = 98.9;

        System.out.println("Name: " + x.name);
        System.out.println("Roll Number: " + x.roll);
        System.out.println("Percentage: " + x.per);
    }
}
