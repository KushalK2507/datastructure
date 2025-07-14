package C_arrays;

import java.util.Arrays;

public class J_RemoveDuplicatesFromSortedArray {

  int[] arr;

  public J_RemoveDuplicatesFromSortedArray(int[] arr) {
    this.arr = arr;
  }

  public int[] removeDuplicates() {

    int unique = 0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] != arr[i+1]){
                arr[unique+1] = arr[i+1];
                unique++;
            }
        }
        return Arrays.copyOf(arr,unique+1);
    }

}
