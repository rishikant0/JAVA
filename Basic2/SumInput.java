import java.util.Scanner;
public class SumInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int r =sc.nextInt();
        System.out.print("Enter the second number : ");
        int q =sc.nextInt();
        int sum = r+q;
        System.out.print(sum);
    }
}