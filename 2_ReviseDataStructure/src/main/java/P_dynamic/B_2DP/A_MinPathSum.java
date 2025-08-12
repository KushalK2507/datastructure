package P_dynamic.B_2DP;

import java.util.List;

public class A_MinPathSum {

	// Traingle Min Sum
  public int triangle(List<List<Integer>> triangle) {
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
  
  // Matrix minPathSum
  public int minPathSum(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;

    for (int i = rows - 1; i >= 0; i--) {
        for (int j = cols - 1; j >= 0; j--) {
            if (i == rows - 1 && j != cols - 1) {
                // Only right move is possible in the last row
                grid[i][j] += grid[i][j + 1];
            } else if (j == cols - 1 && i != rows - 1) {
                // Only down move is possible in the last column
                grid[i][j] += grid[i + 1][j];
            } else if (i != rows - 1 && j != cols - 1) {
                // Choose minimum of right and down
                grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
            }
            // Bottom-right remains unchanged
        }
    }

    return grid[0][0]; // Top-left contains the minimum path sum
}
}
