public class Swap{
    public static void  swap(int a,int b) {
        System.out.println("Befor swap");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        // int temp =a;
        // a=b;
        // b=temp;

        //without any other extra value
        a = a+b;
        b =a-b;
        a =a-b;
        System.out.println("After swap");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
    public static void main(String[] args) {
        int a=90;
        int b =89;
        swap(a,b);
    }
}