package org.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberUsingQueue {

    public static void main(String[] args) {

        System.out.println(d2BUsingQueue(1));
    }

    public static String d2BUsingQueue(int val){

        Queue<Integer> queue = new LinkedList<>();

        while (val > 0){
            queue.offer(val%2);
            val=val/2;
        }

        StringBuilder res = new StringBuilder();

        while (!queue.isEmpty()){
            res.insert(0,queue.poll());
        }

        return res.toString();

    }
}
