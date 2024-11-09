package org.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {

    public static void main(String[] args) {
        System.out.println(kthLargestElement(new int[]{3,2,1,5,6,4},2));

    }

    public static int kthLargestElement(int[] arr, int k){

        Queue<Integer> maxHeap = new PriorityQueue<>();

        for (int i: arr){
            maxHeap.offer(i);
                while (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.poll();
    }
}
