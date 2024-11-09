package searching;

import sorting.MergeSorting;

public class BinarySearching {

    public static void main(String[] args){

        int[] arr = {3,6,7,8,4,6,2,1,0,9,11,32};
        int elementToSearhed = 88;
        int result = binarySearch(arr, elementToSearhed);
        System.out.println("Search Result: "+result);
    }

    public static int binarySearch(int[] arr, int elementToBeSearched){

        MergeSorting.mergeSort(arr, 0, arr.length-1);
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(elementToBeSearched == arr[mid]){
                return mid;
            }
            else if(elementToBeSearched < arr[mid]){
                end = mid-1;
            }
            else if(elementToBeSearched > arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }
}
