

public class fibonacci{

    public static int fib(int n) {
        if(n ==0 || n==1) {
            return n;
           
        }
        int m = fib(n-1) + fib(n-2);
        return m;
    }
    public static void main(String[] args) {
       int  j =6;
       System.out.println(fib(j));

    }
}