package array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {

        int len = nums.length;

        if(len == 0){
            return;
        }
        if(k > len){
            k = k%len;
        }

        reverseArray(nums,0,k-1);
        reverseArray(nums,k,len-1);
        reverseArray(nums,0,len-1);
    }

    private static void reverseArray(int[] nums, int start, int end){

        while(start<end){

            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
