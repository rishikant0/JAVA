import java.util.*;

import java.util.Scanner;

public class linear_search_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declear input
        int n = sc.nextInt(); // input size
        int[] arr = new int[n]; // array declear

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // store value in array
        }

        int target = sc.nextInt(); // take target input
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
                break;

            }
        }

        System.out.print("Target is  found on array -> " + idx);

    }
}
