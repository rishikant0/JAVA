public class AddMiddle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void kth(int a, int k) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        temp = head;
        for (int j = 0; j < i; j++) {
            if (j == i - k) {
                System.out.println("kth node from last is: " + temp.data);
            } else {
                temp = temp.next;
            }
        }
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 10);
        ll.addLast(5);
        ll.addFirst(6);
        ll.print();
        ll.kth(2, 2);
    }
}
