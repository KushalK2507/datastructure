package C_arrays.C_KadaneAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// For finding longest subarray for sum
public class A_MaxSum {

  public int[] maxSubarraySumCircularArray(int[] nums) {
    int n = nums.length;
    int total = 0;

    // For normal Kadane
    int maxSum = nums[0], curMax = 0;
    int maxStart = 0, maxEnd = 0, tempStart = 0;

    // For min-subarray (to find circular max)
    int minSum = nums[0], curMin = 0;
    int minStart = 0, minEnd = 0, tempMinStart = 0;

    for (int i = 0; i < n; i++) {
      total += nums[i];

      // Max subarray (Kadane)
      if (curMax + nums[i] > nums[i]) {
        curMax += nums[i];
      } else {
        curMax = nums[i];
        tempStart = i;
      }
      if (curMax > maxSum) {
        maxSum = curMax;
        maxStart = tempStart;
        maxEnd = i;
      }

      // Min subarray (Kadane min)
      if (curMin + nums[i] < nums[i]) {
        curMin += nums[i];
      } else {
        curMin = nums[i];
        tempMinStart = i;
      }
      if (curMin < minSum) {
        minSum = curMin;
        minStart = tempMinStart;
        minEnd = i;
      }
    }

    // Case 1: All numbers negative
    if (maxSum < 0) {
      return Arrays.copyOfRange(nums, maxStart, maxEnd + 1);
    }

    // Case 2: Circular subarray gives better result
    if (total - minSum > maxSum) {
      // Circular case: use elements outside the min subarray
      List<Integer> res = new ArrayList<>();

      // From 0 to minStart-1
      for (int i = 0; i < minStart; i++) {
        res.add(nums[i]);
      }

      // From minEnd+1 to n-1
      for (int i = minEnd + 1; i < n; i++) {
        res.add(nums[i]);
      }

      // Convert to array
      return res.stream().mapToInt(i -> i).toArray();
    }

    // Case 3: Normal Kadane wins
    return Arrays.copyOfRange(nums, maxStart, maxEnd + 1);
  }
}
