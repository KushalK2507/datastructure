package array.slidingWindow;

import java.util.Arrays;

public class MinSubArrayTargetSum {

    public static void main(String[] args) {

        minSubArray(new int[]{2,3,1,2,4,3},7);

    }

    public static void minSubArray(int[] arr,int targetValue){

        int sum =0;
        int start=0;
        int end =0;
        int minLen =Integer.MAX_VALUE;
        while(end< arr.length){
            sum = sum+arr[end];
            if(sum >= targetValue){
                while(sum >= targetValue){
                    sum = sum-arr[start];
                    start++;
                    minLen = Math.min(minLen,end-start+1);
                }
            }
            end++;
        }

        System.out.println("Start = "+start);

        System.out.println("Min Length = "+(minLen+1));
        System.out.println("Min Sub Array ="+ Arrays.toString(Arrays.copyOfRange(arr, start -1, start+minLen )));
    }
}
