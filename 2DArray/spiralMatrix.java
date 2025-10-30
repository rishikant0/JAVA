public class spiralMatrix{
    public static void spiral(int matrix[][]){
        int startrow = 0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while(startrow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i =startrow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //button
            for(int j =endCol-1; j>=startCol ;j--){
                if(startrow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i =endRow-1; i>startrow;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startrow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        spiral(matrix);
    }
}
