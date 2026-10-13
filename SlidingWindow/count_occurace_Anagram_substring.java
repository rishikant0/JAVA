import java.util.*;

public class count_occurace_Anagram_substring {

    int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();

        int[] patFreq = new int[26];
        for (char c : pat.toCharArray()) {
            patFreq[c - 'a']++;
        }

        int[] winFreq = new int[26];
        int count = 0;

        // first window
        for (int i = 0; i < k; i++) {
            winFreq[txt.charAt(i) - 'a']++;
        }
        if (Arrays.equals(patFreq, winFreq))
            count++;

        // sliding window
        for (int i = k; i < n; i++) {
            winFreq[txt.charAt(i) - 'a']++;
            winFreq[txt.charAt(i - k) - 'a']--;
            if (Arrays.equals(patFreq, winFreq))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        count_occurace_Anagram_substring solution = new count_occurace_Anagram_substring();
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println("Input: txt = " + txt + ", pat = " + pat);
        System.out.println("Output: " + solution.search(pat, txt)); // Expected 3
    }
}
