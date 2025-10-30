public class SizeOfLL {
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
    public static int size;

    public void add(int idx, int data) {
        
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
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
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
          
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SizeOfLL ll = new SizeOfLL();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 10);
        ll.addLast(5);
        ll.addFirst(6);
        ll.print();
        System.out.println("Size of LL: " + ll.size);
    }
}
