package array.slidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class LargestSubArrayWithTargetSum {

    public static void main(String[] args){


        int arr[] = {0,4,0,0,1,2,1,0,5,1,3,6,9,11,0,0,1,1,0,0,1,1};
        System.out.println("Largest SubArray: "+Arrays.toString(longestSubArrayWithTargetValue(arr,4)));

        System.out.println("Largest SubArray: "+Arrays.toString(longestSubArrayWithSlidingWindow(arr,4)));
    }


    //Need to check
    private static int[] longestSubArrayWithSlidingWindow(int[] arr,int targetValue){
        int start =0;
        int end =0;
        int sum =0;
        int lastIndex =0;
        int maxLength=0;

        while (end < arr.length){

            sum = sum+arr[end];

            if(sum < targetValue){
                end++;
            }

            else if(sum == targetValue){
               maxLength = Math.max(maxLength,end-start+1);
                lastIndex=end;
                end++;
            }

            else if(sum > targetValue){

                while (sum > targetValue){
                    sum = sum-arr[start];
                    start++;
                }
                if(sum == targetValue){
                    maxLength = Math.max(maxLength,end-start+1);
                    lastIndex=end;
                }
                end++;
            }
        }

        return Arrays.copyOfRange(arr,lastIndex-maxLength+1,lastIndex+1);
    }



    private static int[] longestSubArrayWithTargetValue(int[] arr,int targetValue){

        HashMap<Integer,Integer> sumToValues = new HashMap<>();
        int lastIndex =0;
        int sum =0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum == targetValue) {
                len = i;
                lastIndex = i+1;
            }
            if(!sumToValues.containsKey(sum)){
                sumToValues.put(sum,i);
            }
            if (sumToValues.containsKey(sum - targetValue) && len < i - sumToValues.get(sum - targetValue))
            {
                len = i - sumToValues.get(sum - targetValue);
                lastIndex = i+1;
            }

        }

        return Arrays.copyOfRange(arr,lastIndex-len,lastIndex);
    }
}
