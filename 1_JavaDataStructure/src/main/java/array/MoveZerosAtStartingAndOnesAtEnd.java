package array;

import java.util.Arrays;

public class MoveZerosAtStartingAndOnesAtEnd {

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,5,7,0,0,7,1,2,4,1};

        int start = 0;
        int end = arr.length-1;
        int zeroIndex = 0;
        int oneIndex=arr.length-1;

        while(start<=end){

            if(arr[start] == 0){
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[start];
                arr[start] = temp;
                zeroIndex++;
                start++;
            }
             else if(arr[start]==1){
                int temp = arr[oneIndex];
                arr[oneIndex] = arr[start];
                arr[start] = temp;
                oneIndex--;
                start++;
                end--;
            }
             else {
                 start++;
            }

             if(arr[end] == 0){
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[end];
                arr[end] = temp;
                zeroIndex++;
                start++;
                end--;
            }
             else if(arr[end] ==1){
                int temp = arr[oneIndex];
                arr[oneIndex] = arr[end];
                arr[end]= temp;
                end--;
                oneIndex--;
            }
             else {
                 end--;
             }
        }
        System.out.println(Arrays.toString(arr));
    }
}
