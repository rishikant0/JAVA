public class paramatric{
public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student("rishikant");
    System.err.println(s2.name);
    student s3 = new student(123);
    System.err.println(s3.roll);
}
}

class student{
    String name;
    String password;
    int roll;
    student(){
        System.err.println("Constructor is called");
    }

    student(String name){
       this.name = name;
    }
    student(int roll){
        this.roll = roll;
    }
}