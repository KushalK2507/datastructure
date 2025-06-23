package P_dynamic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Traingle {

    public int minPathSum(List<List<Integer>> triangle){
        // Use bottom up approach

        int n = triangle.size();

        // Start from second last row and go up
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int curr = triangle.get(row).get(col);
                int below = triangle.get(row + 1).get(col);
                int belowRight = triangle.get(row + 1).get(col + 1);
                triangle.get(row).set(col, curr + Math.min(below, belowRight));
            }
        }

        // Top of the triangle now contains the minimum path sum
        return triangle.get(0).get(0);

    }
}
