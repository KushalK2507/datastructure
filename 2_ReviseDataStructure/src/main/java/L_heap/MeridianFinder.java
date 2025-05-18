package L_heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeridianFinder {

    Queue<Integer> maxHeap = new PriorityQueue<>();
    Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int num){
        minHeap.offer(num);
        maxHeap.offer(num);
    }

    public void printQueue(){
        System.out.println(maxHeap);
        System.out.println(minHeap);
    }

    public double findMedian(){
        return (maxHeap.peek()+minHeap.peek())/2.0;
    }


}
