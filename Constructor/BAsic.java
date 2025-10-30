public class BAsic{
  public static void main(String[] args) {
      student s1 = new student();
  }
}

class student{
    String name;
    String password;
    int roll;
    student(){
        System.err.println("Constructor is called");
    }
}