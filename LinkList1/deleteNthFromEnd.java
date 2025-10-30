public class deleteNthFromEnd {
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
     
    
        public int removelast(){
          if(size == 0){
              System.out.println("LL is empty");
              return -1;
          }else if(size==1){
              int val = head.data;
              head = tail = null;
              size = 0;
              return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
    
public int itrSearch(int key){
    Node temp = head;
    int idx = 0;
    while(temp != null){
        if(temp.data == key){
            return idx;
        }
        temp = temp.next;
        idx++;
    }
    return -1;
}
    public void deleteNthFromend(int m){
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(m == sz){
            head = head.next;
            return;
        }
        int i=1;
        int itofind = sz-m;
        Node prev = head;
        while(i <itofind){
            prev = prev.next;
            i++;
        }
        prev.next =prev.next.next;
       
    }

    public static void main(String[] args) {
        deleteNthFromEnd ll = new deleteNthFromEnd();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 10);
        ll.addLast(5);
        ll.addFirst(6);
        //ll.print();
        System.out.println("Size of LL: " + ll.size);
       // ll.removelast();
        ll.print();
        ll.deleteNthFromend(3);
        ll.print();
    }
}
