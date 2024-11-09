package heap;

import java.util.*;

public class KPairWithSmallestSum {


    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> res = new LinkedList<>();
        Queue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int j : nums1) {
            maxHeap.offer(new int[]{j + nums2[0], 0});
        }

        while(k > 0 && !maxHeap.isEmpty()){
            int[] pair = maxHeap.poll();
            int sum = pair[0];
            int num2Index = pair[1];

            List<Integer> currentPair = new LinkedList<>();
            currentPair.add(sum - nums2[num2Index]);
            currentPair.add(nums2[num2Index]);
            res.add(currentPair);

            if(num2Index+1 < nums2.length){
                maxHeap.offer(new int[]{sum-nums2[num2Index]+nums2[num2Index+1],num2Index+1});
            }
            k--;
        }

        return res;
    }
}
