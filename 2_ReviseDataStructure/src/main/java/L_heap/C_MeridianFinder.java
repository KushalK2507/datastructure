package L_heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class C_MeridianFinder {

  Queue<Integer> minHeap;
  Queue<Integer> maxHeap;

  public C_MeridianFinder() {
    minHeap = new PriorityQueue<>();
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
  }

  public void addNum(int num) {
    maxHeap.offer(num);

    minHeap.offer(maxHeap.poll());
    if (maxHeap.size() < minHeap.size()) {
      maxHeap.offer(minHeap.poll());
    }
  }

  public double findMedian() {
    if (maxHeap.size() == minHeap.size()) {
      return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
    return maxHeap.peek();
  }
}
