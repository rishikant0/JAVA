// public class Sqrt{
//     public static int sqrt(int n,int p) {
//         if(p == 0) {
//             return 1;
//         }
//         return  n * sqrt(n, p-1);
         
        
//     }
//     public static void main(String[] args) {
        
//         System.out.print(sqrt(2,10));
//     }
// }


//optimise method for sqrt
public class Sqrt{
    public static int optimisesqrt(int n,int p) {
        if(p == 0) {
            return 1;
        }
        int m = optimisesqrt(n, p/2); //recursion
              m = m* m;
        if(p % 2 != 0) {
            m = n * m;
        
    }
    return m;
}
    public static void main(String[] args) {
        
        System.out.print(optimisesqrt(2,10));
    }
}
