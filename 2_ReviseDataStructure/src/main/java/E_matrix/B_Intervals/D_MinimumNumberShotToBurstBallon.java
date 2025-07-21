package E_matrix.B_Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class D_MinimumNumberShotToBurstBallon {
    public int findMinArrowShots(int[][] points) {

        // Soring on end index
        Arrays.sort(points, Comparator.comparingInt(e -> e[1]));

        var end = points[0][1];
        var count = 1;
        for(int i=1;i<points.length;i++){
            if(points[i][0] > end){
                count++;
                end = points[i][1];
            }
        }

        return count;
    }
}
