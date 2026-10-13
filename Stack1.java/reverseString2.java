import java.util.*;
import java.util.Stack;
public class reverseString2 {
    public static void reversediplay(Stack<Integer>p){
       while(!p.isEmpty()){
            System.out.println(p.pop());
        }    }
    public static void display(Stack<Integer> s ){
        Stack<Integer> rev = new Stack<>();
        while(!s.isEmpty()){
            
            System.out.println(s.peek());
            int p = s.pop();
            rev.push(p);
        }
        reversediplay(rev);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        display(s);

    }
}
