
import java.util.Scanner;

public class three_digitnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>99 && n<1000){
           
            System.out.println("Number is 3 digit number "+n);
        }else{
            System.out.print("Not a 3 digit number");
        }
        
    }  
}