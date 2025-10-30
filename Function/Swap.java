public class Swap{
    public static void swap(int num1,int num2) {
        int temp =num1;
        num1 = num2 ;
        num2 = temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        swap(a,b);
        System.out.println("a is :" + a);
        System.out.println("b is :"+ b);
    }
}