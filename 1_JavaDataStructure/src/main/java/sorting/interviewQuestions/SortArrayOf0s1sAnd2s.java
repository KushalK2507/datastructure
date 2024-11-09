package sorting.interviewQuestions;

import java.util.Arrays;

// This is also known as Dutch National Flag Problem
public class SortArrayOf0s1sAnd2s {

    public static void main(String[] args){

        int[] arr ={0,1,2,1,2,2,1,0,2,0,1,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortArray(int[] arr){
        int i=0; // To traverse the array and set 1's in correct position
        int j=0; // To set the 0's at the starting
        int k=arr.length-1; // To set the 2's at the end of the array

        while (i < k){
            if(arr[i] ==0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr,i,k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int source, int target){

        arr[source] = arr[source]+ arr[target];
        arr[target] = arr[source]- arr[target];
        arr[source] = arr[source]- arr[target];
    }
}
