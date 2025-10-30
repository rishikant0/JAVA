
import java.util.Scanner;

public class even_odd_takeInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("even number");
        }else{
            System.out.print("Odd number");
        }
    }
}