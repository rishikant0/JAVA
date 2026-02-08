class Stu {
    public long roll;
    public String name;
    public String course;
    public long m1;
    public long m2;
    public long m3;

    public String total() {
        return "Roll: " + roll + ", Name: " + name + ", Course: " + course +
                ", Marks: " + m1 + ", " + m2 + ", " + m3;
    }

    public double avg() {
        return (m1 + m2 + m3) / 3.0;
    }
}

public class student {
    public static void main(String[] args) {
        Stu s = new Stu();

        s.roll = 13;
        s.name = "Rk";
        s.course = "Maths";
        s.m1 = 90;
        s.m2 = 80;
        s.m3 = 70;

        System.out.println(s.total());
        System.out.println("Average: " + s.avg());
    }
}