import java.util.*;

public class pushAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: if the stack is empty, push the data and return
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        
        // Pop the top element, call the function recursively
        int top = s.pop();
        pushAtBottom(s, data);
        
        // Push the top element back onto the stack
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s, 4);
        
        // Print the stack elements
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
