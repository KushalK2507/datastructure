package org.heap;

import java.util.*;

public class KPairsWithSmallesSum {

    public static void main(String[] args) {

        kPairs(new int[]{1,7,11},new int[]{2,4,6},3).forEach(System.out::println);

    }

    public static List<List<Integer>> kPairs(int[] arr1,int[] arr2, int k){

        Queue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> res = new LinkedList<>();

        for (int i : arr1){
            maxHeap.offer(new int[]{i+arr2[0],0});
        }

        while (k > 0 && !maxHeap.isEmpty()){
            int[] pair = maxHeap.poll();
            int arr2Index = pair[1];
            res.add(List.of(pair[0]-arr2[arr2Index],arr2[arr2Index]));

            if (arr2Index+1 < arr2.length){
                maxHeap.offer(new int[]{pair[0]-arr2[arr2Index]+arr2[arr2Index+1],arr2Index+1});
            }
            k--;
        }

        return res;
    }






}
