public class Tiling{
    public static int tiling(int n) {

        //Base class 
        if(n==0 || n==1) {
            return 1;
        }

        //Vertical choice
        int vertical  = tiling(n-1);

        //horizontal choice 
        int hori = tiling(n-2);

        int total = vertical + hori;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}