import java.util.*;
import java.util.Stack;

public class ImplementStackUsingArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        System.out.println("Convert array to stack implementation: " + s);
    }
}