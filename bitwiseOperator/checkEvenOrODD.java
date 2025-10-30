public class checkEvenOrODD {
    public static void checkEvenOrODD(int n){
        int bit =1;
        if((n & bit) ==0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    } {
        
    }
    public static void main(String[] args) {
        checkEvenOrODD(19);
        checkEvenOrODD(4);
        checkEvenOrODD(10);
    }
}
