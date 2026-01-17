package C_array.F_Matrix.tester;

import C_array.F_Matrix.A_SpiralMatrix;
import C_array.F_Matrix.B_SetMatrixToZero;
import C_array.F_Matrix.C_RotateMatrixBy90;
import C_array.F_Matrix.D_MergeIntervals;
import java.util.Arrays;

public class MatrixTester {

  public static void main(String[] args) {

    // Sprial Form of Matrix
    spiralFormMatrix();
    System.out.println("--------------------------------------");

    rotateMatrixBy90();
    System.out.println("--------------------------------------");

    // Set Matrix to Zero
    setMatrixToZero();
    System.out.println("--------------------------------------");

    // Merge Intervals
    mergeIntervals();
    System.out.println("--------------------------------------");
  }

  private static void mergeIntervals() {
    int[][] matrix = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    D_MergeIntervals mergeInterval = new D_MergeIntervals();
    System.out.println("Original Array "+Arrays.deepToString(matrix));
    System.out.print("Merged Interval : ");
    mergeInterval.mergeIntervals(matrix).forEach(System.out::print);
    System.out.println();

    int[][] matrix2 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}, {17, 21}};
    System.out.println("Original Array "+Arrays.deepToString(matrix2));
    System.out.print("Merged Interval 2 : ");
    mergeInterval.mergeIntervals(matrix2).forEach(System.out::print);
    System.out.println();
  }

  private static void rotateMatrixBy90() {
    C_RotateMatrixBy90 rotateMatrixBy90 = new C_RotateMatrixBy90();
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Initial Matrix = " + Arrays.deepToString(matrix));
    rotateMatrixBy90.rotateMatrixBy90(matrix);
    System.out.println("Final Matrix = " + Arrays.deepToString(matrix));
    // {{7,4,1},{8,5,2},{9,6,3}}
  }

  private static void setMatrixToZero() {
    B_SetMatrixToZero setMatrixToZero = new B_SetMatrixToZero();
    int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    System.out.println("Initial Matrix = " + Arrays.deepToString(matrix));
    setMatrixToZero.setMatrixToZero(matrix);
    System.out.println("Final Matrix = " + Arrays.deepToString(matrix));
    // {{1,0,1},{0,0,0},{1,0,1}}
  }

  private static void spiralFormMatrix() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    A_SpiralMatrix spiralMatrix = new A_SpiralMatrix();
    System.out.println("Original Array "+Arrays.deepToString(matrix));
    System.out.println("Spiral Matrix = " + spiralMatrix.spiralMatrix(matrix));
  }
}
