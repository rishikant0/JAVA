public class arrayprint{
    public static void print(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[4][3];
        int[][] arr2 ={{1,2,3},{4,5,6},{7,8,9}};
        print(arr2);
    }
}