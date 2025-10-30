public class factorial{
    public static int  fac(int a) {
        int p =1;
        for(int i=1;i<=a;i++){
        p = p*i;
        }
      return p;
    }
    public static void main(String[] args){
        int a=5;
        int fact = fac(5);
    System.out.print("factorial of a is :"+fact);


    }
}