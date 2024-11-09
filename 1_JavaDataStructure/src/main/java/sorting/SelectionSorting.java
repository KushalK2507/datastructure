package sorting;

import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args){

        int[] arr ={8,9,5,4,7,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min !=i){
                arr[min] = arr[min]+arr[i];
                arr[i] = arr[min]-arr[i];
                arr[min] = arr[min]-arr[i];
            }
        }
    }
}
