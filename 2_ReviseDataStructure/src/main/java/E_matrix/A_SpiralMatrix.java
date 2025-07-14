package E_matrix;

import java.util.LinkedList;
import java.util.List;

public class A_SpiralMatrix {

  int[][] matrix;
  StringBuilder res;

  public A_SpiralMatrix(int[][] matrix) {
    this.matrix = matrix;
    res = new StringBuilder();
  }

    public String spiralForm(){
        
        List<Integer> result = new LinkedList<>();
        int noOfRows = matrix.length;
        int noOfColumns = matrix[0].length;
        int r=0;
        int c=0;
        while(r < noOfRows && c < noOfColumns){

           for(int i=c;i<noOfColumns;i++){
               result.add(matrix[r][i]);
           }
           r++;
           for(int j=r;j<noOfRows;j++){
               result.add(matrix[j][noOfColumns-1]);
           }
           noOfColumns--;

           if(r<noOfRows){

               for(int i=noOfColumns-1;i>c-1;i--){
                   result.add(matrix[noOfRows-1][i]);
               }
               noOfRows--;
           }

           if(c < noOfColumns){

               for(int i=noOfRows-1;i>r-1;i--){
                    result.add(matrix[i][c]);
               }
               c++;
           }
        }

        return result.toString();
    }
}
