import java.util.*;
import java.util.Stack;
public class reverseCharacter {
    public static void reverseCharacter(Stack<Character> s){
    Stack<Character> p = new Stack<>();
        while(!s.isEmpty()){
            System.out.println("Display at -> "+s.peek());
            p.push(s.pop());
        }
System.out.println();
        while(!p.isEmpty()){
            System.out.println("reverse at -> "+p.pop());
            
        }

        
    }
    
    public static void main(String[] args){
        Stack<Character> s = new Stack<>();
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');
        s.push('E');
    
        reverseCharacter(s);
    }
}
