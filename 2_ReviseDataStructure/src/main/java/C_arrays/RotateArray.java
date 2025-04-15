package C_arrays;

public class RotateArray {

    int[] arr;
    int noOfRotation;


    public RotateArray(int[] arr, int noOfRotation){
        this.arr = arr;
        this.noOfRotation = noOfRotation;
    }

    public void rotateArray(){

        int len = arr.length-1;
        if (noOfRotation > len){
            noOfRotation = noOfRotation%len;
        }

        reverseArray(arr,0,noOfRotation-1);
        reverseArray(arr,noOfRotation,len);
        reverseArray(arr,0,len);



    }

    public void reverseArray(int[] arr, int start, int end){

        while (start<end){

            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
