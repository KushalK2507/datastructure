package E_matrix;

public class SpiralMatrix {

    int[][] matrix;
    StringBuilder res;


    public SpiralMatrix(int[][] matrix){
        this.matrix = matrix;
        res = new StringBuilder();
    }

    public String spiralForm(){

        if (matrix.length == 0 || (matrix.length != matrix[0].length)){
            return res.append("Spiral form Not Possible").toString();
        }
        int row = 0;
        int col =0;
        int noOfRow = matrix.length-1;
        int noOfColumn = matrix[0].length-1;


        while (row < noOfRow || col < noOfColumn){

          for (int i = row;i<=noOfColumn;i++){
              res.append(matrix[row][i]).append(" ");
          }
          row++;
          for (int i=row;i<noOfRow;i++){
              res.append(matrix[i][noOfColumn]).append(" ");
          }
          noOfColumn--;
          for (int i=noOfRow;i>=col;i--){
              res.append(matrix[noOfRow][i]).append(" ");
          }
          noOfRow--;
          for (int i=noOfColumn;i>=row;i--){
              res.append(matrix[i][col]).append(" ");
          }
          col++;
        }

        return res.toString();
    }
}
