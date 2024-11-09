package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {

    Queue<Integer> minHeap ;
    Queue<Integer> maxHeap ;

    public MedianFinder() {
        minHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }

    }

    public double findMedian() {

        if(minHeap.size() == maxHeap.size()){
            return (double)(minHeap.peek() + maxHeap.peek())/2;
        }
        else{
            return maxHeap.peek();
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */