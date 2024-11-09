package queue;

import java.util.Arrays;

public class CircularQueueUsingArray {

    int[] circularQueueArray;
    int front;
    int end;

    public CircularQueueUsingArray(int size){
        circularQueueArray = new int[size];
        front=-1;
        end=-1;
    }

    public boolean isEmpty(){
        if(front == -1 && end ==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if((circularQueueArray!= null && end == circularQueueArray.length-1 && front == 0)){
            return true;
        }
        else if(front == end +1){
            return true;
        }
        else {
            return false;
        }
    }

    public void offer(int data){
        if(isEmpty()){
            front=0;
            end++;
        }
        else if(isFull()){
            System.out.println("Queue is Full. Element cannot be inserted: "+data);
            return;
        }
        else if(front !=0 && end == circularQueueArray.length-1){
            end =0;
        }
        else {
            end ++;
        }
        circularQueueArray[end] = data;
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = circularQueueArray[front];
        circularQueueArray[front] =-1;
        if(front == end){
            front=-1;
            end=-1;
        }
        else if(front == circularQueueArray.length-1){
            front =0;
        }
        else {
            front++;
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Queue is Empty");
            return -1;
        }
        return circularQueueArray[front];
    }

    public void deleteQueue(){
        front =-1;
        end =-1;
        circularQueueArray = null;

    }

    public void displayQueue(){

        System.out.println(Arrays.toString(circularQueueArray));
    }

}
