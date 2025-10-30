import java.util.*;

public class CircularQueueArray {
    public static class Cqa {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];

        private void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
            }
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                int val = arr[f];
                if (f == arr.length - 1)
                    f = 0;
                else
                    f++;
                return val;
            }
            // size--;
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else
                return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        public void display() throws Exception {
            if (size == 0) {
                System.out.println("queue is Empty");
                return;
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.println(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.display();
        q.add(5);
        q.display();
    }
}
