public class basic{
    public static void Decnum(int n ) {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        Decnum(n-1);
    }

    public static void Incnum(int n) {
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        Incnum(n-1);
          System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n =10;
        Decnum(n);
        Incnum(n);
    }
}