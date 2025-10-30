
import java.util.Scanner;

public class basic{
    public static void printhello(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
    public static int calculatesum(int num1 ,int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        printhello();
        int a = t.nextInt();
        int b = t.nextInt();
        int sum = calculatesum(a,b);
        System.out.println("sum is :"+ sum);
    }
}