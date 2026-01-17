package K_Dynanic.C_2DP.tester;

import K_Dynanic.C_2DP.L_Traingle;

import java.util.List;

public class TwoDpTester {

    public static void main(String[] args){

        // Traingle To tp Bottom Min Sum
        topToBottomMinSum();
        System.out.println();
        System.out.println("--------------------");
    }

    private static void topToBottomMinSum() {
        List<List<Integer>> triangle =
                List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

        L_Traingle traingle = new L_Traingle();
        System.out.println("Input Triangle is "+traingle);
        System.out.println("Min path Sum: ");
        System.out.print(traingle.maxPathSumInTraingle(triangle));
    }
}
