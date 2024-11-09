package array.matrix;

public class SpiralFormMatrix {

    public static void main (String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrix(matrix);
        spiralformMatrix(matrix);

    }
    public static void printMatrix(int[][] matrix){

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralformMatrix(int[][] matrix){
        int r= matrix.length;
        int c= matrix[0].length;
        int row=0;
        int col=0;
        while (row < r && col < c){

            //Printing the row (left to right)
            for (int i=col;i<c;i++){
                System.out.print(matrix[row][i]);
            }
            row++;

            //Printing the column (top to bottom)
            for (int i=row;i<r;i++){
                System.out.print(matrix[i][c-1]);
            }
            c--;

            //This condition is used if column is more than row
            if(row < r) {
                //Printing the row (right to left)
                for (int i = c - 1; i >= col; i--) {
                    System.out.print(matrix[r - 1][i]);
                }
                r--;
            }

            //This condition is used if row is more than column
            if(col < c) {
                //Printing the column (bottom to top)
                for (int i = r - 1; i > row; i--) {
                    System.out.print(matrix[i][col]);
                }
                col++;
            }
        }
    }

}


