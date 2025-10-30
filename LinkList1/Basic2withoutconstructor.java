// package LinkedList1;

public class Basic2withoutconstructor {
    public static class Node {
        int val;
        Node next;
    }

    public static void main(String[] args) {
        // create nodes of linked list without constructor initialization value
        Node a = new Node();
        a.val = 1;
        Node b = new Node();
        b.val = 2;
        Node c = new Node();
        c.val = 3;
        Node d = new Node();
        d.val = 4;
        Node e = new Node();
        e.val = 5;
        Node f = new Node();
        f.val = 6;
        Node g = new Node();
        g.val = 7;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;

        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }

    }
}
