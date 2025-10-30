public class transposeMatrix{
    public int[][] transpose(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int  j=0;j<n;j++){
                ans[i][j] = matrix[j][i];
                System.out.print(ans[i][j]);
            }
        }
        System.err.println();

    }
  public static void main(String[] args) {
      int[][] arr ={{1,2,3},
                    {4,5,6},
                {7,8,9}};
                transpose(arr);
  }
}