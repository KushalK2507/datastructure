package C_arrays.B_AdvanceArray;

import java.util.HashSet;
import java.util.Set;

public class B_PairToTargetSumInArray {

  int[] arr;
  int target;

  public B_PairToTargetSumInArray(int[] arr, int target) {
    this.arr = arr;
    this.target = target;
  }

  public int[] getPair() {

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
