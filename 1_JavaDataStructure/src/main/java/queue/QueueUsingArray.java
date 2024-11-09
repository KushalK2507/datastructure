package queue;

import java.util.Arrays;

public class QueueUsingArray {

    int[] queueArray;
    int front;
    int end;

    public QueueUsingArray(int size){
        queueArray = new int[size];
        front =-1;
        end = -1;
    }

    public void offer(int data){
        if(isEmpty()){
            front ++;
        }
        end++;
        queueArray[end]=data;
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = queueArray[front];
       front++;
        return value;
    }

    public int peek(){
        return queueArray[front];
    }

    public void deleteQueue(){
        queueArray = null;
        front=-1;
        end =-1;
    }

    public boolean isFull(){
        if(queueArray != null && end == queueArray.length-1){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public void displayQueue(){
        System.out.print(Arrays.toString(queueArray));
    }
}
