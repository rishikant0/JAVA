import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKelement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
            System.out.println(q);
        }
    }
}
