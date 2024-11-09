package searching;

import sorting.MergeSorting;

import java.util.Arrays;

public class SearchInsertionPositionInSortedArray {

    public static void main(String[] args){

        int[] arr = {6,8,3,5,7,9,11,2,1};
        int result = insertionTarget(arr,6);
        System.out.println(result);


    }

    public static int insertionTarget(int[] arr, int value){

        MergeSorting.mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
        System.out.println("Array Length: "+arr.length);
        int start = 0;
        int end = arr.length-1;

        boolean isPresent = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == value){
                isPresent=true;
                return mid;
            } else if (value < arr[mid]) {
                end = mid-1;
            } else if (value > arr[mid]) {
                start = mid+1;
            }
        }
        if(!isPresent){
            return end+1;
        }
        return -1;
    }

}
