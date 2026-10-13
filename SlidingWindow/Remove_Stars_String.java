import java.util.*;

public class Remove_Stars_String {

    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Remove_Stars_String solution = new Remove_Stars_String();
        String s = "leet**cod*e";
        System.out.println("Input: " + s);
        System.out.println("Output: " + solution.removeStars(s)); // Expected "lecoe"
    }
}
