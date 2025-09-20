package E_matrix.A_matrix;

import java.util.Arrays;

public class C_Rotating2dArrayBy90 {

  public static void main(String[] args) {

    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    boolean result = rotateArray90(array);
    if (result) {
      System.out.println(Arrays.deepToString(array));
    } else {
      System.out.println("Rotation Not possible");
    }
  }

  public static boolean rotateArray90(int[][] matrix) {
    int n = matrix.length;

    // 1. Transpose (swap across diagonal)
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // 2. Reverse each row
    for (int i = 0; i < n; i++) {
      int left = 0, right = n - 1;
      while (left < right) {
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }
    return true;
  }
}
