import java.util.LinkedList;
public class LLframework{
 public static void main(String[] args) {
    //create -
     LinkedList<Integer> ll = new LinkedList<>();
     //add
     ll.addFirst(1);
     ll.addFirst(2);
     ll.addFirst(3);
     ll.addLast(0);
     System.out.println(ll);
     ll.removeFirst();
     ll.removeFirst();
     System.out.println(ll);
 }   
}