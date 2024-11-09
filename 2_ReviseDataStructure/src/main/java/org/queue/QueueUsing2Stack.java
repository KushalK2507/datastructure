package org.queue;

import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Collectors;

public class QueueUsing2Stack {

    public static void main(String[] args) {

        QueueFrom2Stack queueUsingArray = new QueueFrom2Stack();
        queueUsingArray.offer(10);
        queueUsingArray.offer(1);
        queueUsingArray.offer(0);
        queueUsingArray.offer(9);
        System.out.println(queueUsingArray.peek());
        System.out.println(queueUsingArray);
        System.out.println(queueUsingArray.poll());
        System.out.println(queueUsingArray.peek());
        queueUsingArray.offer(99);
        System.out.println(queueUsingArray.peek());
        System.out.println(queueUsingArray.poll());
        System.out.println(queueUsingArray);

    }
}

class QueueFrom2Stack{


    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();


    public void offer(int val){

            while (!stack.isEmpty()){
                tempStack.push(stack.pop());
            }
            stack.push(val);
            while (!tempStack.isEmpty()){
                stack.push(tempStack.pop());
            }

    }

    public int poll(){

        if (isEmpty()){
            return -1;
        }
        return stack.pop();


    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return stack.peek();

    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public String toString(){

       return new StringBuilder(stack.toString()).reverse().toString();
    }

}
