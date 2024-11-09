package slidingWindow;

import java.util.Arrays;

public class MinSubArrayWithTargetSum {

    int[] arr;
    int targetSum;


    public MinSubArrayWithTargetSum(int[] arr, int targetSum){
        this.arr = arr;
        this.targetSum = targetSum;
    }

    public int[] minSubArray(){

        int start =0;
        int end =0;
        int minLength = Integer.MAX_VALUE;
        int sum =0;
        int endIndex =0;
        while (end < arr.length){
            sum = sum+arr[end];
                if (sum >= targetSum){
                    if (sum == targetSum && minLength > end-start+1){
                        endIndex = end;
                    }
                    while (sum > targetSum){
                        sum = sum - arr[start];
                        start++;
                    }
                    if (minLength > end - start+1){
                        minLength = end-start+1;
                        endIndex = end;
                    }
                }
                end++;
            }
        return Arrays.copyOfRange(arr,endIndex-minLength+1,endIndex+1);
    }
}
