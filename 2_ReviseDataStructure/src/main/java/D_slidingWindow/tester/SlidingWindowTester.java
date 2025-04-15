package D_slidingWindow.tester;

import D_slidingWindow.LongestPallendromicString;
import D_slidingWindow.LongestSubArrayWithTargetSum;
import D_slidingWindow.MinSubArrayWithTargetSum;

import java.util.Arrays;

public class SlidingWindowTester {

    public static void main(String[] args) {

        //Longest SubArrayWithTargetSum
        longestSubArrayWithTargetSum();
        System.out.println("----------------------------");

        //longest pallendromic string
        longestPallendromicString();
        System.out.println("----------------------------");

        // Min SubArray with Target Sum
        minSubArrayWithTargetSum();
        System.out.println("----------------------------");
    }

    private static void longestSubArrayWithTargetSum(){
       int[] arr = {1, 2, 3, 1, 1, 1, 1};
       int target = 3;
        LongestSubArrayWithTargetSum longestSubArrayWithTargetSum = new LongestSubArrayWithTargetSum(arr,target);
       System.out.println("Longest SubArray = "+ Arrays.toString(longestSubArrayWithTargetSum.longestSubArray()));
    }
    private static void longestPallendromicString(){
        String s = "Kushal";
        LongestPallendromicString longestPallendromicString = new LongestPallendromicString(s);
        System.out.println("Longest Pallendromic String = "+longestPallendromicString.longestString());

        String s1 = "Kesarwani";
        LongestPallendromicString longestPallendromicString1 = new LongestPallendromicString(s1);
        System.out.println("Longest Pallendromic String = "+longestPallendromicString1.longestString());

        String s2 = "sssss";
        LongestPallendromicString longestPallendromicString2 = new LongestPallendromicString(s2);
        System.out.println("Longest Pallendromic String = "+longestPallendromicString2.longestString());


    }

    private static void minSubArrayWithTargetSum(){
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int target = 3;
        MinSubArrayWithTargetSum minSubArrayWithTargetSum = new MinSubArrayWithTargetSum(arr,target);
        System.out.println("Min SubArray = "+ Arrays.toString(minSubArrayWithTargetSum.minSubArray()));

    }


}
