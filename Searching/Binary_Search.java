import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = false;

        int t = sc.nextInt();
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == t) {
                res = true;
                break;
            } else if (arr[mid] > t) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println("answer is found ->" + res);
    }
}
