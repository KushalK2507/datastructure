package C_arrays.B_AdvanceArray;

import java.util.Arrays;

//Given an array arr[] denoting heights of n towers and a positive integer k.
// For each tower, you must perform exactly one of the following operations exactly once.
//        Increase the height of the tower by k
//        Decrease the height of the tower by k
// Find out the minimum possible difference between the height of the shortest and tallest towers after
// you have modified each tower.
//        Note: It is compulsory to increase or decrease the height by k for each tower.
//Input: arr[] = [1, 5, 8, 10], k = 2
//        Output: 5
//        Explanation: The array can be modified as [3, 3, 6, 8]. The difference between the largest and the smallest is 8 - 3 = 5.

public class R_MinimizeTheHeight {

    //The modified height of the tower can be negative.
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        var n= arr.length-1;
        var ans = arr[n] - arr[0];
        for(int i=0;i<n;i++){
            var minHeight = Math.min(arr[0]+k,arr[i+1]-k);
            var maxHeight = Math.max(arr[n]-k,arr[i]+k);

            ans = Math.min(ans,maxHeight-minHeight);
        }

        return ans;
    }

    // After the operation, the resultant array should not contain any negative integers.
    public int getMinDiff2(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        var n= arr.length-1;
        var ans = arr[n]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] - k < 0) continue;
            var minHeight = Math.min(arr[0]+k,arr[i+1]-k);
            var maxHeight = Math.max(arr[n]-k,arr[i]+k);

            ans = Math.min(ans,maxHeight-minHeight);
        }

        return ans;
    }

}
