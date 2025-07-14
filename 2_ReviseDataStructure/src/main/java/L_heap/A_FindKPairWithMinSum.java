package L_heap;

import java.util.*;

public class A_FindKPairWithMinSum {

  int[] nums1;
  int[] nums2;
  int k;

  public A_FindKPairWithMinSum(int[] num1, int[] num2, int k) {
    this.nums1 = num1;
    this.nums2 = num2;
    this.k = k;
  }

    public List<List<Integer>> kSmallestPairs() {

        List<List<Integer>> res = new LinkedList<>();
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int j : nums1) {
            minHeap.offer(new int[]{j + nums2[0], 0});
        }

        while(k > 0 && !minHeap.isEmpty()){
            int[] pair = minHeap.poll();
            int sum = pair[0];
            int num2Index = pair[1];

            List<Integer> currentPair = new LinkedList<>();
            int num1Value = sum - nums2[num2Index];
            int num2Value = nums2[num2Index];
            currentPair.add(num1Value);
            currentPair.add(num2Value);
            res.add(currentPair);

            if(num2Index+1 < nums2.length){
                minHeap.offer(new int[]{num1Value+nums2[num2Index+1],num2Index+1});
            }
            k--;
        }

        return res;
    }
}
