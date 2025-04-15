package L_heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {

    Queue<Integer> queue;
    int[] arr;
    int k;

    public KthLargestElementInArray(int[] arr, int k){
        queue = new PriorityQueue<>();
        this.arr = arr;
        this.k = k;
    }

    public int kthLargestElement(){

        if (arr.length < k){
            return -1;
        }

        for (int num : arr){
            queue.offer(num);
            if (queue.size() == k){
                return queue.poll();
            }
        }

        return queue.poll();
    }



}
