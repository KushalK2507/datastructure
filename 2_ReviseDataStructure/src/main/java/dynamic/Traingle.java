package dynamic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Traingle {

    public int minPathSum(List<List<Integer>> triangle){

        int[][] val = new int[triangle.size()][triangle.size()];
        for (int[] temp: val){
            Arrays.fill(temp,Integer.MAX_VALUE);
        }
        return findMinPathSum(triangle,0,0,val);
    }
    private int findMinPathSum(List<List<Integer>> input, int i, int j, int[][] val){

       if (input.size() == i){
           return 0;
       }

       if (val[i][j] != Integer.MAX_VALUE){
           return val[i][j];
       }

       //current value + next row value same i
        int a = input.get(i).get(j)+findMinPathSum(input,i+1,j,val);
        //current value + next row value same i+1
       int b = input.get(i).get(j)+findMinPathSum(input,i+1,j+1,val);
       val[i][j] = Math.min(a,b);
       return val[i][j];
    }
}
