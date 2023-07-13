package Arrays;

public class Matrix {

    public static boolean SearchMatrix(int M[][] , int key){
        int row = 0 , col = M[0].length - 1 ;
        while ((row <= M.length -1)&&(col>=0)){
            if (M[row][col] == key ){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            } else if (M[row+1][col]<=key) {
                row++;
            }else if(M[row][col-1 ]<= key) {
                col--;
            }else{
                return false;
            }
        }return false;
    }
    public static void DiagonalSum(int[][] mat){
        int Psum = 0 ,Ssum = 0 ;
        for(int i = 0 ; i < mat[0].length ; i++){
            Psum += mat[i][i];
            if(i == mat.length-i-1){
                continue;
            }
            Ssum += mat[i][mat.length-i-1];
        }
        System.out.println("Diagonal Sum = " +(Psum+Ssum));
    }

    public static void PrintSpiral(int M[][]){
        int StartRow = 0 , EndRow = M.length - 1 , StartCol = 0 ,EndCol = M[0].length -1;

        while (StartRow <= EndRow && StartCol <= EndCol){

            // Top
            for(int j = StartCol ; j <= EndCol ; j++){
                System.out.print(M[StartRow][j] + " ");
            }
            // Right
            for(int i = StartRow+1 ; i <= EndRow ; i++ ){
                System.out.print(M[i][EndCol] + " ");
            }
            // Bottom
            for(int j = EndCol - 1 ; j >= StartCol; j--){
                System.out.print(M[EndRow][j] + " ");
            }
            // Left
            for (int i = EndRow - 1 ; i >= StartRow + 1 ; i--){
                System.out.print(M[i][StartCol] + " ");
            }

            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }

        System.out.println();
    }

    public static void main(String args[]){
        int mat[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                };
        int[][] mat2 = {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

        PrintSpiral(mat);
        DiagonalSum(mat);
        System.out.println(SearchMatrix(mat2,32));
    }
}
