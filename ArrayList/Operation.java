
import java.util.ArrayList;

public class Operation{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //to add the element 
       list.add(1);  //O(1)
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
      System.out.println(list);

     //Get operation O(1)  to find tha number with the help of indexing 
      int element = list.get(2);
      System.err.println(element);

      //remove element
      list.remove(2);
      System.err.println(list);

       //set -> exchange of element using indexing
       list.set(2,10);
       System.err.println(list);


       //contains -> to find tha element is present or not
       System.out.println(list.contains(1));
       System.out.println(list.contains(10));
    }
}