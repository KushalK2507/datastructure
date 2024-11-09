package org.array;

import java.util.Arrays;
import java.util.Map;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = new int[]{8,9,0,3,2,5,1,7,21};
        reArrangeMaxMinForm(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 ={0,1,2,1,2,2,1,0,2,0,1,0};
        dutchNationalFlag(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 ={-4,-1,0,3,10};
        System.out.println("SquareOfSortedArray= "+Arrays.toString(squareSortedArray(arr2)));

    }

    public static int[] squareSortedArray(int[] arr){

        int[] result = new int[arr.length];
        int start=0;
        int end = arr.length-1;

        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                result[i] = arr[start]*arr[start];
                start++;
            }
            else {
                result[i] = arr[end]*arr[end];
                end--;
            }
        }
        return result;
    }

    public static void dutchNationalFlag(int[] arr){

        int i=0;
        int j=0;
        int k=arr.length-1;
        while (i< k){

            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i] ==1) {
                i++;
            }
            else if(arr[i] ==2 ){
                swap(arr, i,k);
                k--;
            }
        }
    }

    private static void swap(int[] arr, int a, int b){

        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    public static void reArrangeMaxMinForm(int[] arr){

        int start = 0;
        int end = arr.length-1;
        quickSort(arr, start,end);
        System.out.println("SortedArray="+Arrays.toString(arr));
        int max = arr[end]+1;
        for(int j=0;j<arr.length;j++){
            if(j%2==0){
                arr[j] = arr[j] + (arr[end]%max)*max;
                end--;
            }
            else {
                arr[j] = arr[j] + (arr[start]%max)*max;
                start++;
            }
        }

        System.out.println("ModifiedArray="+Arrays.toString(arr));

        for(int j=0;j<arr.length;j++){
            arr[j] = arr[j]/max;
        }
    }

    public static void selectionSorting(int[] arr ){

        for(int i=0;i< arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min =j;
                }
                if(min != i){
                    arr[min] = arr[min]+arr[i];
                    arr[j] = arr[min]-arr[i];
                    arr[min] = arr[min]-arr[i];
                }
            }

        }
    }

    public static void bubbleSorting(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start<end){
            int mid = (end + (end-start))/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){

        int n1 = mid-start+1;
        int n2 = end-mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

       for(int i=0;i<n1;i++){
           leftArray[i] = arr[start+i];
       }

       for(int i=0;i<n2;i++){
           rightArray[i] = arr[mid+i+1];
       }
       int i=0;
       int j=0;
       int k=start;
       while (i < n1 && j<n2){

           if(leftArray[i]<rightArray[j]){
               arr[k] = leftArray[i];
               i++;
           }
           else {
               arr[k] = rightArray[j];
               j++;
           }
           k++;
       }

       while(i<n1){
           arr[k] = leftArray[i];
           i++;
           k++;
       }

        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int start, int end){

        if(start<end){
            int pivot = getPartition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    private static int getPartition(int[] arr, int start , int end){
        int pivot = end;
        int i=start-1;
        for(int j=start;j<=end;j++){
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
