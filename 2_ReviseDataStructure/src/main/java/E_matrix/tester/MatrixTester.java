package E_matrix.tester;

import E_matrix.A_SpiralMatrix;
import E_matrix.E_MergeInterval;

public class MatrixTester {


    public static void main(String[] args) {

        //Sprial Form of Matrix
        spiralFormMatrix();
        System.out.println("--------------------------------------");

        //Merge Intervals
        mergeIntervals();
        System.out.println("--------------------------------------");

    }

    private static void mergeIntervals(){
    int[][] matrix = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    E_MergeInterval CMergeInterval = new E_MergeInterval(matrix);
    System.out.print("Merged Interval : ");
    CMergeInterval.mergeIntervals().forEach(System.out::print);
    System.out.println();

    int[][] matrix2 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}, {17, 21}};
    E_MergeInterval CMergeInterval1 = new E_MergeInterval(matrix2);
    System.out.print("Merged Interval 2 : ");
    CMergeInterval1.mergeIntervals().forEach(System.out::print);
    System.out.println();
    }

  private static void spiralFormMatrix() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    A_SpiralMatrix ASpiralMatrix = new A_SpiralMatrix(matrix);
    System.out.println("Spiral Matrix = " + ASpiralMatrix.spiralForm());
  }
}
