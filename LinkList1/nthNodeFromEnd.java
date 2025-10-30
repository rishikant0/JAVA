public class nthNodeFromEnd {
    public static Node nthEnd(Node head,int n){
int s=0;
      Node temp =head;
      while(temp!=null)
{
    s++;
    temp = temp.next;
}
      int m = s-n+1;
      temp = head;
      for(int i=1 ;i<=m-1;i++){
        temp = temp.next;
      }
      return temp;
    }

    public static Node nthEnd2(Node head ,int n){
        Node slow =head;
        Node fast = head;
        for(int i=0;i<n;i++)
{
    fast = fast.next;
}
            while(fast!=null){
                slow = slow.next;
                fast =fast.next;
            }
            return slow;
    }
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    } 

    public static void main(String[] args) {
        Node a  =new Node(100);
        Node b  =new Node(10);
        Node c  =new Node(102);
        Node d  =new Node(12);
        Node e  =new Node(13);
        a.next =b;
        b.next=c;
    c.next=d;
    d.next = e;
    Node te = nthEnd(a,3);
    Node to = nthEnd2(a,1);
System.out.println(te.val);
System.out.println(to.val);
    } 
}
