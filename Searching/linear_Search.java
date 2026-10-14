import java.util.*;

class linear_Search {

    public static void main(String[] args) {
        int[] arr = { 12, 43, 1, 8, 94, 45, 13, 5, 85 };
        int target = 5;
        int idx = -1;
        // Linear searching
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;

            }
        }
        if (idx > -1) {
            System.out.print("Target is  found on array -> " + idx);

        } else
            System.out.print("Target is not found on array -> -1");
    }
}