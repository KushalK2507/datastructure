package arrays;

public class ReverseArrayWithoutUsingNewArray {


    int[] arr;

    public ReverseArrayWithoutUsingNewArray(int[] arr){
        this.arr = arr;
    }

    public void reverseArray(){

        int start =0;
        int end =arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
