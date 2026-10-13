import java.util.*;

public class first_negative_subarray {

    static class Solution {
        static List<Integer> firstNegInt(int arr[], int k) {
            List<Integer> res = new ArrayList<>();
            Queue<Integer> que = new LinkedList<>();
            int n = arr.length;

            // first window
            for (int i = 0; i < k; i++) {
                if (arr[i] < 0)
                    que.add(i);
            }
            res.add(que.isEmpty() ? 0 : arr[que.peek()]);

            // sliding windows
            for (int i = k; i < n; i++) {
                while (!que.isEmpty() && que.peek() <= i - k) {
                    que.poll();
                }
                if (arr[i] < 0)
                    que.add(i);
                res.add(que.isEmpty() ? 0 : arr[que.peek()]);
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        System.out.println("Input: " + Arrays.toString(arr) + ", k = " + k);
        List<Integer> result = sol.firstNegInt(arr, k);
        System.out.println("Output: " + result); // Expected [-1, -1, -7, -15, -15, 0]
    }
}
