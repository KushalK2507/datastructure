package C_arrays;

import java.util.HashSet;
import java.util.Set;

public class PairToTargetSumInArray {

    int[] arr;
    int target;

    public PairToTargetSumInArray(int[] arr, int target){
        this.arr=arr;
        this.target=target;
    }

    public int[] getPair(){

        Set<Integer> elements = new HashSet<>();

        for (int digit:arr){
        int sum = target-digit;
        if (elements.contains(sum)){
            return new int[]{sum,digit};
        }
            elements.add(digit);
        }
        return new int[]{-1,-1};


    }

}
