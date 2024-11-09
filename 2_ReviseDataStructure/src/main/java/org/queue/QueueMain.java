package org.queue;

import java.util.Arrays;

public class QueueMain {

    public static void main(String[] args) {

        QueueUsingArray queueUsingArray = new QueueUsingArray(10);
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


class QueueUsingArray{
    int front;
    int end;

    int[] queueArray;

    QueueUsingArray(int size){

        front=-1;
        end=-1;
        queueArray = new int[size];
    }

    public void offer(int val){

        if(front == -1){
            front++;
        }
        end++;
        queueArray[end]= val;
    }

    public int poll(){

        if(front == -1){
            return -1;
        }

        int val = queueArray[front];
        front++;

        return val;
    }

    public int peek(){
        if(front == -1){
            return -1;
        }

        return queueArray[front];

    }

    public boolean isEmpty(){

        return front == -1 || end == -1;
    }

    public String toString(){
        if(front == -1 || end == -1){
            return "";
        }
        return Arrays.toString(Arrays.copyOfRange(queueArray,front,end+1));
    }

    

}
