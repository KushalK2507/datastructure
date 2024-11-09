package org.heap;

import java.util.*;

class MedianFinder {

    Queue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
    Queue<Integer> maxHeap = new PriorityQueue<>();

    public void addNum(int val){
        maxHeap.offer(val);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian(){

        if (maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }
        else {
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        }

    }

    public String toString(){

        StringBuilder builder = new StringBuilder();

        minHeap.forEach(builder::append);
        maxHeap.forEach(builder::append);


        return builder.toString();
    }


}


public class MedianFinderMain{

    public static void main(String[] args) {

        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        System.out.println("Display 1= "+finder);
        finder.addNum(2);
        System.out.println("Display 2= "+finder);
        System.out.println("Median = "+finder.findMedian());
        finder.addNum(3);
        System.out.println("Display 3= "+finder);
        System.out.println("Median = "+finder.findMedian());


    }
}
