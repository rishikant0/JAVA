package SlidingWindow;

public class Max_Vowels_Substring_Len_K {

    static class Solution {
        public boolean isVowel(char ch) {
            return "aeiouAEIOU".indexOf(ch) != -1;
        }

        public int maxVowels(String s, int k) {
            char[] arr = s.toCharArray();
            int count = 0;

            // initial window
            for (int i = 0; i < k; i++) {
                if (isVowel(arr[i]))
                    count++;
            }
            int max = count;

            // sliding window
            for (int i = k; i < arr.length; i++) {
                if (isVowel(arr[i]))
                    count++; // add new char
                if (isVowel(arr[i - k]))
                    count--; // remove old char
                max = Math.max(max, count);
            }

            return max;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abciiidef";
        int k = 3;
        System.out.println("Input: " + s + ", k = " + k);
        System.out.println("Output: " + sol.maxVowels(s, k)); // Expected 3
    }
}
