package slidingWindow;

import java.util.Arrays;

public class LongestSubArrayWithTargetSum {

    int[] arr;
    int targetSum;

    public LongestSubArrayWithTargetSum(int[] arr, int targetSum){
        this.arr = arr;
        this.targetSum = targetSum;
    }

    public int[] longestSubArray(){

        int start =0;
        int end =0;
        int sum =0;
        int maxLength = 0;
        int lastIndex =0;
        while (end < arr.length){
            sum = sum+arr[end];
            if (sum < targetSum){
                end++;
            }
            else if (sum == targetSum && maxLength < end-start+1){
                maxLength = end - start;
                lastIndex = end;
                end++;
            }
            else if (sum > targetSum){
                while (sum > targetSum){
                    sum = sum - arr[start];
                    start++;
                }
                if (sum == targetSum && maxLength < end-start+1){
                    maxLength = end-start;
                    lastIndex = end;
                }
                end++;
            }
        }
        return Arrays.copyOfRange(arr,lastIndex-maxLength,lastIndex+1);
    }
}
