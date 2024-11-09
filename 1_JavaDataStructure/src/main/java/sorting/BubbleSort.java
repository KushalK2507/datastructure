package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] ags){
        int[] arr = {6,7,3,9,5,2,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                   arr[j+1] = arr[j] - arr[j+1];
                   arr[j] = arr[j]-arr[j+1];
                }
            }
        }
    }
}
