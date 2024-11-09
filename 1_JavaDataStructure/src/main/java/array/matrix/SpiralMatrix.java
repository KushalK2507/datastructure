package array.matrix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {

    public static void main(String[] args) {

       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

       spiralOrder(matrix).forEach(System.out::print);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());

    }
}
