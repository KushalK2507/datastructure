package sorting;

import java.util.Arrays;

public class InsertionSorting {

    public static void main(String[] args){
        int[] arr ={8,6,9,4,3,2,5,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if(arr[i] < arr[j]){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
    }
}
