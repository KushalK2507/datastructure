package C_array.C_KadaneAlgo.tester;

import C_array.C_KadaneAlgo.A_MaxSubArray;

import java.util.Arrays;

public class KadaneAlgoTester {

    public static void main(String[] args){
        maxSubArray();
    }

    private static void maxSubArray(){
        A_MaxSubArray maxSubArray = new A_MaxSubArray();
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Original Array "+ Arrays.toString(arr));
        System.out.println("Expected Output = [7, -1, 2, 3]");
        var res = maxSubArray.maxSubArray(arr);
        System.out.println("Max SubArray is "+Arrays.toString(res));
    }
}
