package D_slidingWindow.tester;

import D_slidingWindow.A_LongestSubArrayWithTargetSum;
import D_slidingWindow.B_LongestPallendromicString;
import D_slidingWindow.C_MinSubArrayWithTargetSum;
import java.util.Arrays;

public class SlidingWindowTester {

  public static void main(String[] args) {

    // Longest SubArrayWithTargetSum
    longestSubArrayWithTargetSum();
    System.out.println("----------------------------");

    // longest pallendromic string
    longestPallendromicString();
    System.out.println("----------------------------");

    // Min SubArray with Target Sum
    minSubArrayWithTargetSum();
    System.out.println("----------------------------");
  }

  private static void longestSubArrayWithTargetSum() {
    int[] arr = {1, 2, 3, 1, 1, 1, 1};
    int target = 3;
    A_LongestSubArrayWithTargetSum ALongestSubArrayWithTargetSum =
        new A_LongestSubArrayWithTargetSum(arr, target);
    System.out.println(
        "Longest SubArray = " + Arrays.toString(ALongestSubArrayWithTargetSum.longestSubArray()));
  }

  private static void longestPallendromicString() {
    String s = "Kushal";
    B_LongestPallendromicString BLongestPallendromicString = new B_LongestPallendromicString(s);
    System.out.println(
        "Longest Pallendromic String = " + BLongestPallendromicString.longestString());

    String s1 = "Kesarwani";
    B_LongestPallendromicString BLongestPallendromicString1 = new B_LongestPallendromicString(s1);
    System.out.println(
        "Longest Pallendromic String = " + BLongestPallendromicString1.longestString());

    String s2 = "sssss";
    B_LongestPallendromicString BLongestPallendromicString2 = new B_LongestPallendromicString(s2);
    System.out.println(
        "Longest Pallendromic String = " + BLongestPallendromicString2.longestString());
  }

  private static void minSubArrayWithTargetSum() {
    int[] arr = {1, 2, 3, 1, 1, 1, 1};
    int target = 3;
    C_MinSubArrayWithTargetSum CMinSubArrayWithTargetSum =
        new C_MinSubArrayWithTargetSum(arr, target);
    System.out.println(
        "Min SubArray = " + Arrays.toString(CMinSubArrayWithTargetSum.minSubArray()));
  }
}
