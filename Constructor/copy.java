public class copy{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "rishikant";
        s1.roll = 123;
        s1.password = "abfn";
        student s2 = new student(s1);
        s2.password ="wdjufc";
    }
    }
    
    class student{
        String name;
        String password;
        int roll;

        //copy constructor
        student(String s1){
            this.name = name;
            this.roll = roll;
        }
        student(){
            System.err.println("Constructor is called");
        }
    
        
        
    }