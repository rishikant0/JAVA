
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10;
        int b=20;
         System.out.println("Enter operator : ");
         char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.print(a+b);
              break;
            case '-' : System.out.print(a-b);  
              break;
            case '*' : System.out.print(a*b); 
              break;
            case '/' : System.out.print(a/b);  
              break;
            default :
            System.out.print("Invalid operator ");
        }
    }
}