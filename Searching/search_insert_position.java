import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 8, 9 };
        int target = 3;

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(lo);
    }
}