package C_array.B_SliddingWindow.tester;

import C_array.B_SliddingWindow.A_LongestSubArrayWithTargetSum;
import C_array.B_SliddingWindow.B_LongestPallendromicString;
import C_array.B_SliddingWindow.C_MinSubArrayWithTargetSum;
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
    A_LongestSubArrayWithTargetSum longestSubArrayWithTargetSum =
        new A_LongestSubArrayWithTargetSum();
    System.out.println(
        "Longest SubArray = "
            + Arrays.toString(
                longestSubArrayWithTargetSum.longestSubArrayWithTargetSum(arr, target)));
  }

  private static void longestPallendromicString() {
    String s = "Kushal";
    B_LongestPallendromicString longestPallendromicString = new B_LongestPallendromicString();
    System.out.println(
        "Longest Pallendromic String = "
            + longestPallendromicString.longestPallendromicSubstring(s));

    String s1 = "Kesarwani";
    System.out.println(
        "Longest Pallendromic String = "
            + longestPallendromicString.longestPallendromicSubstring(s1));

    String s2 = "sssss";
    System.out.println(
        "Longest Pallendromic String = "
            + longestPallendromicString.longestPallendromicSubstring(s2));
  }

  private static void minSubArrayWithTargetSum() {
    int[] arr = {1, 2, 3, 1, 1, 1, 1};
    int target = 3;
    C_MinSubArrayWithTargetSum minSubArrayWithTargetSum = new C_MinSubArrayWithTargetSum();
    System.out.println(
        "Min SubArray = "
            + Arrays.toString(minSubArrayWithTargetSum.minSubArrayWithTargetSum(arr, target)));
  }
}
