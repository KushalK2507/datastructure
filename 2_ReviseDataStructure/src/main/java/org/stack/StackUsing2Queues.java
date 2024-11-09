package org.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class StackUsing2Queues {

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }

}

class StackUsingQueues{

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> tempQueue = new LinkedList<>();


    public void push(int value){

        tempQueue.offer(value);
        while (!queue1.isEmpty()){
            tempQueue.offer(queue1.poll());
        }

        var temp = queue1;
        queue1 = tempQueue;
        tempQueue = temp;
    }

    public int pop(){

        if(queue1.isEmpty()){
            return -1;
        }
        return queue1.poll();

    }

    public int peek(){

        if(queue1.isEmpty()){
            return -1;
        }

        return queue1.peek();
    }

    public boolean isEmpty(){

        return queue1.isEmpty();
    }

    public String toString(){
        return queue1.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

}
