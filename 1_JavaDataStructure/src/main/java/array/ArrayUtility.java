package array;

import java.util.Arrays;

public class ArrayUtility {

    public static void main (String[] args){

        int[] arr = {1,2,3,4,5,6};
        // To get sub-array from whole array o/p = (2,3,4,5)
        Arrays.copyOfRange(arr, 1, arr.length-1);

    }
}
