package E_matrix.tester;

import E_matrix.MergeInterval;
import E_matrix.SpiralMatrix;

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
        int[][] matrix = {{1,3},{2,6},{8,10},{15,18}};
        MergeInterval mergeInterval = new MergeInterval(matrix);
        System.out.print("Merged Interval : ");
        mergeInterval.mergeIntervals().forEach(System.out::print);
        System.out.println();

        int[][] matrix2 = {{1,3},{2,6},{8,10},{15,18},{17,21}};
        MergeInterval mergeInterval1 = new MergeInterval(matrix2);
        System.out.print("Merged Interval 2 : ");
        mergeInterval1.mergeIntervals().forEach(System.out::print);
        System.out.println();

    }

    private static void spiralFormMatrix(){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralMatrix spiralMatrix = new SpiralMatrix(matrix);
        System.out.println("Spiral Matrix = "+spiralMatrix.spiralForm());
    }
}
