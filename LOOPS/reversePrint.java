public class reversePrint{
    public static void main(String[] agrs){
          int n =1234;
            while(n>0){
                int last =n%10;
                System.out.print(last);
                 n = n/10;
            }
    }
}