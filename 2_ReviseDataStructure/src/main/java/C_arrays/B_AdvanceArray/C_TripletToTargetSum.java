package C_arrays.B_AdvanceArray;

import java.util.HashSet;
import java.util.Set;

public class C_TripletToTargetSum {

  int[] arr;
  int target;

  public C_TripletToTargetSum(int[] arr, int target) {
    this.arr = arr;
    this.target = target;
  }

  public int[] tripletToTargetSum() {

        for (int i=0;i<arr.length;i++){
            int sum = target - arr[i];
            Set<Integer> elements  = new HashSet<>();
            for (int j=i+1;j<arr.length;j++){
                int temp = sum - arr[j];
                if (elements.contains(temp)){
                    return new int[]{arr[i],arr[j],temp};
                }
                elements.add(arr[j]);
            }
        }

        return new int[]{-1,-1,-1};
    }
}
