import java.util.Scanner;

public class pmc {
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n");
        int n = sc.nextInt();
        System.out.print("enter r");
        int r = sc.nextInt();
        int ncr = fact(n) / (fact(r) * fact(n - r));

        System.out.println(ncr);
    }

}
// if (r > n || n < 0 || r < 0) {
// System.out.println("Invalid input. Ensure that 0 ≤ r ≤ n.");
// } else {
// long ncr = fact(n) / (fact(r) * fact(n - r));
// System.out.println("nCr = " + ncr);
// }
