public class Largest3Number{
   public static void main(String[] args) {
       int a =6;
       int b =5;
       int c =4;
       if(a>b && a>c){
        System.out.println("A is largest");
       }else if(a<b && b>c){
        System.out.println("B is largest");
       }else{
        System.out.println("c is largest");
       }
   }
}