package sorting.interviewQuestions;

import java.util.Arrays;

//Input = {-4,-1,0,3,10} ==> Square of Each element ==> {16,1,0,9,100}
//Output = {0,1,9,16,100}
public class SquareOfSortedArray {

    public static void main(String[] args){
        int[] arr ={-4,-1,0,3,10};
        arr=squareSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    // In this we compare the first and last element and which is bigger we will insert at the end.
    // In this we will start filling the array from the end.
    public static int[] squareSortedArray(int[] arr){

        int i=0;
        int n = arr.length-1;
        int j=n;
        int[] result = new int[n+1];
        for (int k=n;k>=0;k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            }
            else {
                result[k] = arr[j]*arr[j];
                j--;
            }
        }

        return result;

    }
}
