public class AddAtEND {
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static class linkedList {
        Node head=null;
        Node tail = null;
    
        // Method to insert at the end of the linked list
         void insertAtEnd(int data) {
            Node temp = new Node(data);
            tail.next = temp;
            tail = temp;
            // If the list is empty, make the new node the head
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
                
            }
            tail =temp;
        }
                
    
        // Helper method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            linkedList list = new linkedList();
    
            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);
    
            // Print the linked list
            list.printList();
        }
    }
    
}
