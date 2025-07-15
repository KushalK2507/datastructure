package P_dynamic.B_1DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
"Input: nums = [10,9,2,5,3,7,101,18] Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Input: nums = [0,1,0,3,2,3] Output: 4
Input: nums = [7,7,7,7,7,7,7] Output: 1"

 */
public class E_LongestIncreasingSubsequence {

  public int longestSubsequence(int[] nums) {
    List<Integer> tails = new ArrayList<>();

    for (int num : nums) {
      int idx = Collections.binarySearch(tails, num);

      // If not found, binarySearch returns (-(insertion point) - 1)
      if (idx < 0) idx = -(idx + 1);

      if (idx == tails.size()) {
        tails.add(num); // Extend the LIS
      } else {
        tails.set(idx, num); // Replace with smaller candidate
      }
    }

    return tails.size(); //
  }
}
