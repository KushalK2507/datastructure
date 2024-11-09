package org.searching;

import java.util.Arrays;
import java.util.Map;

public class Searching {

    public static void main(String[] args) {

        System.out.println("Binary Searching = "+binarySearching(new int[]{2,3,5,2,1,5,7,0,2},2));

        int[] arr = new int[]{2,3,5,2,1,5,7,0,2};
        System.out.println("Length of Arr = "+arr.length);
        System.out.println("Insertion index = "+insertionPositionInSortedArray(arr,10));

        System.out.println("Search in Rotated Array = "+searchInRotatedArray(new int[]{5,6,7,0,1,3,4},5));

        System.out.println("Start and End Index = "+Arrays.toString(findStartingAndEndPosition(new int[]{0, 1, 2, 2, 2, 3, 5, 5, 7},2)));

        System.out.println("Min in Sorted Array = "+minInSortedRotatedArray(new int[]{5,6,7,-4,0,1,3,4}));

    }

    public static int minInSortedRotatedArray(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int min =Integer.MAX_VALUE;

        while (start <= end){
            int mid = start+(end-start)/2;
            if(arr[start] < arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            min= Math.min(min,arr[mid]);

        }

        return min;
    }

    public static int[] findStartingAndEndPosition(int[] arr, int targetValue){

        int start = findStartPosition(arr,targetValue);
        int end = findEndPosition(arr,targetValue);

        return new int[]{start,end};

    }

    private static int findStartPosition(int[] arr, int targetValue){

        int start =0;
        int end = arr.length-1;
        int index =-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == targetValue){
                end = mid-1;
                index=mid;
            } else if (arr[mid] > targetValue) {
                end= mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return index;
    }

    private static int findEndPosition(int[] arr, int targetValue){

        int start =0;
        int end = arr.length-1;
        int index =-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == targetValue){
                start = mid+1;
                index=mid;
            } else if (arr[mid] > targetValue) {
                end= mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return index;
    }


    public static int searchInRotatedArray(int[] arr, int targetValue){

        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == targetValue){
                return mid+1;
            } else if (arr[start] <= arr[mid]) {
                if(targetValue <= arr[mid] && targetValue >= arr[start] ){
                    end = mid-1;
                }
                else {
                    start= mid+1;
                }
            }
            else {
                if(targetValue > arr[mid] && targetValue < arr[start]){
                    start= mid+1;
                }
                else {
                    end = mid-1;
                }

            }
        }

        return -1;


    }

    public static int binarySearching(int[] array,int targetValue){

        quickSort(array,0,array.length-1);
        System.out.println("Quick Sort Completed"+ Arrays.toString(array));
        int start =0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(array[mid] == targetValue){
                return mid;
            }
            else if(array[mid] > targetValue){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int insertionPositionInSortedArray(int[] array,int targetValue){

        quickSort(array,0,array.length-1);
        System.out.println("Quick Sort Completed"+ Arrays.toString(array));
        int start =0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(array[mid] == targetValue){
                return mid;
            }
            else if(array[mid] > targetValue){
                end = mid-1;
            }
            else  {
                start = mid+1;
            }
        }
        return end+1;
    }

    private static void quickSort(int [] arr, int start, int end){

        if(start < end){
            int pivot = getPivotElement(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }

    }

    private static int getPivotElement(int[] arr, int start, int end){

        int pivot = end;
        int i=start-1;
        for(int j=start;j<=end;j++ ){
            if(arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return i;
    }


}
