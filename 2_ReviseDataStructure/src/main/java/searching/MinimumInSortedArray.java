package searching;

import java.util.Map;

public class MinimumInSortedArray {

    private int[] arr;

    public MinimumInSortedArray(int[] arr){
        this.arr = arr;
    }
    public int minInRotatedSortedArray(){

        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;

        while (start <= end){
            int mid = (end+start)/2;
            if (arr[mid] > arr[start] && arr[mid] < arr[end]){
                end = mid-1;
            }
            else {
                start= mid+1;
            }
            min = Math.min(min,arr[mid]);
        }

        return min;
    }



}
