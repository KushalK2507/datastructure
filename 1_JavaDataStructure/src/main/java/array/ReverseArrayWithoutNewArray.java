package array;

import java.util.Arrays;

public class ReverseArrayWithoutNewArray {

    public static  void main (String[] args){
        int[] arr = {1,2,3,4,5};
         reverseArray(arr);
        Arrays.stream(arr).forEach(element -> System.out.print(element+" "));
    }

    public static void  reverseArray(int[] arr){
        for (int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
