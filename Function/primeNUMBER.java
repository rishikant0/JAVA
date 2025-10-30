public class primeNUMBER{
    public static void prime(int n) { for (int i = 2; i <= n; i++) 
        { 
            if (isPrime(i)) {
                 System.out.println(i + ""); 
                } }
    // public static void prime(int n) {
    //     for(int i=2;i<=n;i++){
    //         if (isPrime(i)) 
    //         { 
    //             System.out.println(i + ""); 
    //     }
    // }
    System.out.println();
    }
    public static void main(String[] args) {
        prime(5);
    }
}