package array.matrix;

import java.util.HashMap;
import java.util.Map;

public class MaxPointOnLine {

    public static void main(String[] args) {

    }

    public int maxPoints(int[][] points){

        int n= points.length;
        if(n==1){
            return n;
        }

        int res =1;

        for(int i=0;i<n;i++){

            Map<Double,Integer> slopeToCount = new HashMap<>();
            for(int j=0;j<n;j++){

                if(i != j){
                    double deltaY = points[j][1] - points[i][1];
                    double deltaX = points[j][0]- points[i][0];
                    double slope = deltaX !=0 ? deltaY/deltaX : Double.MAX_VALUE;

                    slopeToCount.put(slope,slopeToCount.getOrDefault(slope,1)+1);
                    res = Math.max(res,slopeToCount.get(slope));
                }
            }

        }

        return res;

    }
}
