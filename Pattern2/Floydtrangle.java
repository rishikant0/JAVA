public class Floydtrangle{
    public static void pattern(int row, int col) {
        int p=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
               
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5,5);
    }
    }

