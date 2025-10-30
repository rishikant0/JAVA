public class invertedHalfPyramid{
    public static void pattern(int row, int col) {
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=(col-i-1);j++){
                System.out.print(j+1);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5,5);
    }
    }

