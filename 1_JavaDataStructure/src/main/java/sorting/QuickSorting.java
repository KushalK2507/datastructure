package sorting;

import java.util.Arrays;

public class QuickSorting {

    public static void main(String[] args){
        int[] arr={8,9,4,0,3,2,5,1,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int start, int end){
        if(start< end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = end;
        int i = start-1;
        for (int j=start;j<=end;j++){
            if(arr[j]<= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}
