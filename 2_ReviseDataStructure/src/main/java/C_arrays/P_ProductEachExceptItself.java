package C_arrays;

import java.util.Arrays;

public class P_ProductEachExceptItself {

  int[] arr;
  int[] res;

  public P_ProductEachExceptItself(int[] arr) {
    this.arr = arr;
    res = new int[arr.length];
    Arrays.fill(res, 1);
  }

    public int[] productAllExceptItselfInArray(){

        int curr =1;
        for (int i=0;i<arr.length;i++){
            res[i] = curr* res[i];
            curr= curr*arr[i];
        }
        curr=1;
        for (int i=arr.length-1;i>=0;i--){
            res[i] = curr*res[i];
            curr = curr*arr[i];
        }

        return res;
    }

}
